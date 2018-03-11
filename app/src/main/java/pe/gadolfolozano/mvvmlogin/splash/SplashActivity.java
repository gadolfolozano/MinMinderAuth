package pe.gadolfolozano.mvvmlogin.splash;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import javax.inject.Inject;

import pe.gadolfolozano.mvvmlogin.BR;
import pe.gadolfolozano.mvvmlogin.R;
import pe.gadolfolozano.mvvmlogin.base.BaseActivity;
import pe.gadolfolozano.mvvmlogin.databinding.ActivitySplashBinding;
import pe.gadolfolozano.mvvmlogin.login.LoginActivity;

/**
 * Created by adolfo on 9/03/18.
 */

public class SplashActivity extends BaseActivity<ActivitySplashBinding, SplashViewModel> implements SplashNavigator {

    @Inject
    SplashViewModel mSplashViewModel;

    @Override
    public int getBindingVariable() {
        return BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_splash;
    }

    @Override
    public SplashViewModel getViewModel() {
        return mSplashViewModel;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mSplashViewModel.setNavigator(this);
        mSplashViewModel.startApp();
    }

    @Override
    public void openLoginActivity() {
        Intent intent = LoginActivity.newIntent(SplashActivity.this);
        startActivity(intent);
        finish();
    }

    @Override
    public void openMainActivity() {

    }
}