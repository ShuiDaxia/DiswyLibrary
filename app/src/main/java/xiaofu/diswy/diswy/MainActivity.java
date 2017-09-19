package xiaofu.diswy.diswy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int x = 15;
    private int y = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // first push to Github
        //我把studio更新到2.3.3了
        //我pull了,然后已经能显示上一条注释了
        addSomething();
    }

    public void addSomething(){
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println(x + "---优雅地交换x和y----" + y);
    }
}
