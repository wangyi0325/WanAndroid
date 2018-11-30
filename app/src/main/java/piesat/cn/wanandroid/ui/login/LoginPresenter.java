package piesat.cn.wanandroid.ui.login;


import piesat.cn.wanandroid.base.baseMvp.BasePresenter;

/**
 * 作者：wangyi
 * <p>
 * 邮箱：wangyi@piesat.cn
 */
public class LoginPresenter extends BasePresenter<LoginContract.LoginView> implements LoginContract.LPresenter {
    LoginContract.LoginView view;

    public LoginPresenter(LoginContract.LoginView loginView){
        this.view = loginView;
    }

    @Override
    public void login(String userName, String userPassworld) {
    }
}
