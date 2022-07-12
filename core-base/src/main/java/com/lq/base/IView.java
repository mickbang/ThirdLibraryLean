package com.lq.base;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface IView {

    void initData(@Nullable Bundle bundle);

    int bindLayout();

    void setContentView();

    void initView(@Nullable Bundle savedInstanceState, @Nullable View contentView);

    void doBusiness();

}