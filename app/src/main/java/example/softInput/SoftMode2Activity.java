package example.softInput;

import android.os.Bundle;

import com.style.base.BaseWhiteTitleBarActivity;
import com.style.framework.R;
import com.style.framework.databinding.ActivitySoftMode2Binding;

import org.jetbrains.annotations.Nullable;

import example.gesture.BaseRightSlideFinishActivity;

public class SoftMode2Activity extends BaseWhiteTitleBarActivity {

    ActivitySoftMode2Binding bd;

    @Override
    protected void onCreate(@Nullable Bundle arg0) {
        super.onCreate(arg0);
        setContentView(R.layout.activity_soft_mode_2);
    }


    @Override
    public void initData() {
        bd = getBinding();
        setToolbarTitle("状态栏为主题配置里的颜色");
    }
}
