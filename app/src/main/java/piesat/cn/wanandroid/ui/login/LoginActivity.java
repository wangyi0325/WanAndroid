package piesat.cn.wanandroid.ui.login;

import piesat.cn.wanandroid.R;
import piesat.cn.wanandroid.base.BaseActivity;

/**
 * 作者：wangyi
 * <p>
 * 邮箱：wangyi@piesat.cn
 */
public class LoginActivity extends BaseActivity implements LoginContract.LoginView {

    private LoginContract.LPresenter loginPresenter;

    @Override
    protected int getLayout() {
        return R.layout.activity_login;
    }

    @Override
    protected void initView() {
        loginPresenter = new LoginPresenter(this);

    }

    @Override
    protected void initData() {
        loginPresenter.login("111","222");
    }

    @Override
    public void showNormal() {

    }

    @Override
    public void showError(String err) {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void showEmpty() {

    }

    @Override
    public void reload() {

    }

    @Override
    public void loginOk(String responseData) {

    }

    @Override
    public void loginErr(String errData) {

    }
}
