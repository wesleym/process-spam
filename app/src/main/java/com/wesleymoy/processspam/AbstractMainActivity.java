package com.wesleymoy.processspam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public abstract class AbstractMainActivity extends AppCompatActivity {
    @Override
    protected void onResume() {
        super.onResume();
        startActivity(new Intent(this, getDestinationActivity()));
    }

    protected abstract Class<?> getDestinationActivity();

    public static class MainActivity0 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity1.class;
        }
    }

    public static class MainActivity1 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity2.class;
        }
    }

    public static class MainActivity2 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity3.class;
        }
    }

    public static class MainActivity3 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity4.class;
        }
    }

    public static class MainActivity4 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity5.class;
        }
    }

    public static class MainActivity5 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity6.class;
        }
    }

    public static class MainActivity6 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity7.class;
        }
    }

    public static class MainActivity7 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity8.class;
        }
    }

    public static class MainActivity8 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity9.class;
        }
    }

    public static class MainActivity9 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity10.class;
        }
    }

    public static class MainActivity10 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity11.class;
        }
    }

    public static class MainActivity11 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity12.class;
        }
    }

    public static class MainActivity12 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity13.class;
        }
    }

    public static class MainActivity13 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity14.class;
        }
    }

    public static class MainActivity14 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity15.class;
        }
    }

    public static class MainActivity15 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity16.class;
        }
    }

    public static class MainActivity16 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity17.class;
        }
    }

    public static class MainActivity17 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity18.class;
        }
    }

    public static class MainActivity18 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity19.class;
        }
    }

    public static class MainActivity19 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity20.class;
        }
    }

    public static class MainActivity20 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity21.class;
        }
    }

    public static class MainActivity21 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity22.class;
        }
    }

    public static class MainActivity22 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity23.class;
        }
    }

    public static class MainActivity23 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity24.class;
        }
    }

    public static class MainActivity24 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity25.class;
        }
    }

    public static class MainActivity25 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity26.class;
        }
    }

    public static class MainActivity26 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity27.class;
        }
    }

    public static class MainActivity27 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity28.class;
        }
    }

    public static class MainActivity28 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity29.class;
        }
    }

    public static class MainActivity29 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity30.class;
        }
    }

    public static class MainActivity30 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity31.class;
        }
    }

    public static class MainActivity31 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity32.class;
        }
    }

    public static class MainActivity32 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity33.class;
        }
    }

    public static class MainActivity33 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity34.class;
        }
    }

    public static class MainActivity34 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity35.class;
        }
    }

    public static class MainActivity35 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity36.class;
        }
    }

    public static class MainActivity36 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity37.class;
        }
    }

    public static class MainActivity37 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity38.class;
        }
    }

    public static class MainActivity38 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity39.class;
        }
    }

    public static class MainActivity39 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity40.class;
        }
    }

    public static class MainActivity40 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity41.class;
        }
    }

    public static class MainActivity41 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity42.class;
        }
    }

    public static class MainActivity42 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity43.class;
        }
    }

    public static class MainActivity43 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity44.class;
        }
    }

    public static class MainActivity44 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity45.class;
        }
    }

    public static class MainActivity45 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity46.class;
        }
    }

    public static class MainActivity46 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity47.class;
        }
    }

    public static class MainActivity47 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity48.class;
        }
    }

    public static class MainActivity48 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity49.class;
        }
    }

    public static class MainActivity49 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity50.class;
        }
    }

    public static class MainActivity50 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity51.class;
        }
    }

    public static class MainActivity51 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity52.class;
        }
    }

    public static class MainActivity52 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity53.class;
        }
    }

    public static class MainActivity53 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity54.class;
        }
    }

    public static class MainActivity54 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity55.class;
        }
    }

    public static class MainActivity55 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity56.class;
        }
    }

    public static class MainActivity56 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity57.class;
        }
    }

    public static class MainActivity57 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity58.class;
        }
    }

    public static class MainActivity58 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity59.class;
        }
    }

    public static class MainActivity59 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity60.class;
        }
    }

    public static class MainActivity60 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity61.class;
        }
    }

    public static class MainActivity61 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity62.class;
        }
    }

    public static class MainActivity62 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity63.class;
        }
    }

    public static class MainActivity63 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity64.class;
        }
    }

    public static class MainActivity64 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity65.class;
        }
    }

    public static class MainActivity65 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity66.class;
        }
    }

    public static class MainActivity66 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity67.class;
        }
    }

    public static class MainActivity67 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity68.class;
        }
    }

    public static class MainActivity68 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity69.class;
        }
    }

    public static class MainActivity69 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity70.class;
        }
    }

    public static class MainActivity70 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity71.class;
        }
    }

    public static class MainActivity71 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity72.class;
        }
    }

    public static class MainActivity72 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity73.class;
        }
    }

    public static class MainActivity73 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity74.class;
        }
    }

    public static class MainActivity74 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity75.class;
        }
    }

    public static class MainActivity75 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity76.class;
        }
    }

    public static class MainActivity76 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity77.class;
        }
    }

    public static class MainActivity77 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity78.class;
        }
    }

    public static class MainActivity78 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity79.class;
        }
    }

    public static class MainActivity79 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity80.class;
        }
    }

    public static class MainActivity80 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity81.class;
        }
    }

    public static class MainActivity81 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity82.class;
        }
    }

    public static class MainActivity82 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity83.class;
        }
    }

    public static class MainActivity83 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity84.class;
        }
    }

    public static class MainActivity84 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity85.class;
        }
    }

    public static class MainActivity85 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity86.class;
        }
    }

    public static class MainActivity86 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity87.class;
        }
    }

    public static class MainActivity87 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity88.class;
        }
    }

    public static class MainActivity88 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity89.class;
        }
    }

    public static class MainActivity89 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity90.class;
        }
    }

    public static class MainActivity90 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity91.class;
        }
    }

    public static class MainActivity91 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity92.class;
        }
    }

    public static class MainActivity92 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity93.class;
        }
    }

    public static class MainActivity93 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity94.class;
        }
    }

    public static class MainActivity94 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity95.class;
        }
    }

    public static class MainActivity95 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity96.class;
        }
    }

    public static class MainActivity96 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity97.class;
        }
    }

    public static class MainActivity97 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity98.class;
        }
    }

    public static class MainActivity98 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity99.class;
        }
    }

    public static class MainActivity99 extends AbstractMainActivity {
        @Override
        protected Class<?> getDestinationActivity() {
            return MainActivity0.class;
        }
    }
}
