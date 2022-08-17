package com.example.umc_careever

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.widget.ViewPager2
import com.example.umc_careever.databinding.FragmentHomeBinding
import com.google.gson.Gson
import kotlinx.coroutines.InternalCoroutinesApi
import java.util.ArrayList


class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomeBinding
    private var ListDatas = ArrayList<Help>()


    private lateinit var HelpDB: HelpDataBase



    @InternalCoroutinesApi
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

//        HelpDB = HelpDataBase.getInstance(requireContext())!!
//        ListDatas.addAll(HelpDB.HelpDao().getHelps())

        val listAdapter = ListRVAdapter()

        ListDatas.apply {
            add(
                Help(1, "해외이동 봉사자를 모집합니다", "카라(KARA)", "20220725~20220730")
            )

            add(
                Help(2, "입양확정된 태백이의 해외입양을 도와주세요 ", "개인봉사자", "20220810~20220815")
            )

            add(
                Help(3, "토론토 출국자 모집", "개인봉사자", "20220721~20220825")
            )

            add(
                Help(4, "캐나다(몬트리올,벤쿠버)해외이동 봉사자를 찾습니다", "동물자유연대","20220801~20220820")
            )

            add(
                Help(5, "해외이동 봉사자 급구합니다", "개인봉사자", "20220811~20220815")
            )

            add(
                Help(6, "LA에서 유기견 입양을 기다리고 있어요", "개인봉사자", "20220815~20220820")
            )
        }

        listAdapter.replaceList(ListDatas)
        binding.homeListRecyclerView.adapter = listAdapter

        return inflater.inflate(R.layout.fragment_home, container, false)

    }

}