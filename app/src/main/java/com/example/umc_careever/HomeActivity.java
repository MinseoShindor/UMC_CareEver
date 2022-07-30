package com.example.umc_careever;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    private ArrayList<ListItem> mArrayList;
    private ListViewAdapter adapter;
    int dataCount = -1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_home);

        RecyclerView mRecyclerView = findViewById(R.id.recycler_view);

        LinearLayoutManager mLinearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLinearLayoutManager);

        mArrayList = new ArrayList<ListItem>();



        adapter.addItem("카라(KARA)", "해외이동봉사자 급구합니다");
        adapter.addItem("웰컴독코리아", "프랑스 출국자 모집합니다");
        adapter.addItem("동물자유연대", "캐나다(몬트리올, 벤쿠버) 해외이동봉사자를 찾습니다!\n");
        adapter.addItem("동물자유연대", "미국(로스엔젤레스)출국자를 구합니다 ");
        adapter.addItem("개인봉사자", "입양 확정된 태백이의 해외입양을 도와주세요 ");
    }
}
