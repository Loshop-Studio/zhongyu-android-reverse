package com.friday.cloudsnote;

import android.content.Context;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.multidex.MultiDex;
import com.friday.cloudsnote.SophixStubApplication;
import com.taobao.sophix.SophixApplication;
import com.taobao.sophix.SophixEntry;
import com.taobao.sophix.SophixManager;
import com.taobao.sophix.listener.PatchLoadStatusListener;

@StabilityInferred(parameters = 0)
@Keep
/* loaded from: classes3.dex */
public final class SophixStubApplication extends SophixApplication {
    public static final int $stable = 8;

    @StabilityInferred(parameters = 1)
    @SophixEntry(App.class)
    @Keep
    public static final class RealApplicationStub {
        public static final int $stable = 0;
    }

    private final void initSophix() {
        SophixManager.getInstance().setContext(this).setAppVersion(getPackageManager().getPackageInfo(getPackageName(), 0).versionName).setSecretMetaData("30927116-1", "668636b36fafa95e1adfaeedf6eb6154", "MIIEugIBADANBgkqhkiG9w0BAQEFAASCBKQwggSgAgEAAoIBAQCT0BzWXGezmNtBSp3v33tjB5TY2eJcADYiOlfCoZ3kKqHUNJ/oU5gyl0fUrP4HwWPqNcVgGhQqYGV/8/zgObHQ3l7Ef6pxaIVMGUViBG2ziYD1H3lvLeYIWQNztZnFS3kelKnj7gP9fVaUK8Nagx0eEhDWuA/b5p4LyHQ0V1ItITnmoIydX1GMFg6ob9YH72QcwLDYMu5TDofl/uxDSytHXnjXoQTIYIocAqCBLbkX5hOn77KW4Jr5DBxQK28F28AGdCWJpjA9/Adxc3hrUJmqSDxIe8NcAWDgxQ0JAIGhn5Uv4SAIdvk3fpDsiy4pAJ38lpiIBjOn9HhHagJLpt8hAgMBAAECggEAdJNS2wEfzHZGndTigPdpka2+B9S3gMWt7ArFgjwCkZvJ69nhL9MWGvhS73nME4PDcEkeNG/87Xr/Mg3Up2b5RXjLlv/1BeJgFqdroCVL+6f7q9c556R0YqsJXO2hrAedK7Al2Ryzyu1aJhvpw23avgeTfjTGVTEp/rMGau1fYzU4gyZSs95AXXj7RTRsoooqsO1gfYYHzQBWWEgWkzmdc7RgXz+GCoB1Zob66J/32zFaIMBG1Y47YY1r2Ine05SY47YWEyVrPI8StkrmTMkCjJowU95mq3v25vhHtBApiO+3Zw3PU+tH8s2FSkXYnpjCQoo2mwYsio6jFzCjuE/X0QKBgQDR4GVQ19PsfMCxgPCN9ICnXTDURijENhUGqg3zTxOHC77y8GNAy+9FFCCcBKiRx6HjzI+lXoh97dKwL4ROT2cwTkF+sqpLjjPK++pPNhviig2z3WJHHI/86k0I+y1cUBopFZNFGClaCY3V37+rXzqHKKBuPiA9MSpkq05BbDuFRQKBgQC0TAiEQZmJ//pPrTJu7TJ+gT6Oz4MsAUmL+AzGFM+2MgkCYtiZ82fqBD2ZaCoT0/zHkDzkpFOmteHNxN4HXJF0SLBJq3mvVZBSWBkFCJLq6kxE/9TKgk3Ft+DUm8uKRc+xsmqM5biH03+OgnmV7xEyDC3y6MNomYhyllbyImjKLQKBgC4jHUKrX4wiVJ3w0XDzagDgzKYtkjKoDPE9Gvn8zTcnzt9LFxacfkn6RbzmjUQW1bDlPELHSEwepu1SVMx+ShnlaiJ3FlaruRkLThQBuhmP7bk3lq45SjH4M90gknUzqryTYJ+U0ypW5VY57MG4mn4x4Sq6/41ULJSa0AYzy9XdAn8j6wHHV0o/M7+qH9bsQlTM3vKXgL+hBKCiQchJrduzcERbNVXxVYxeEnozFY1MZe710sZOxm3jyFgzpgSVctuHTvPPuVmElIcr4GEbn5mlMwf+tvitX0gfG4Ku2Fq0MTQvMlwHtbwNUxUWTufp9rZ2QfblbXmAXRXRviGUG0bFAoGAHphKL+3NZGVmF8fhHRrlRirl0D5/URDAEWcOGDYHlsPbioIFALS+FIDaD0wqNRH422Kfew4ArQlrXYKN/5DODKp4Nd+7XyUlbuGlegGm8e42IQnC2rKY5e/glRYEu9xXHGXYOhT9UKJU+LrvfuuKTxc64gnY5cNQffvJlk6WFHk=").setEnableDebug(false).setPatchLoadStatusStub(new PatchLoadStatusListener() { // from class: w1.j
            @Override // com.taobao.sophix.listener.PatchLoadStatusListener
            public final void onLoad(int i10, int i11, String str, int i12) {
                SophixStubApplication.initSophix$lambda$0(i10, i11, str, i12);
            }
        }).initialize();
        SophixManager.getInstance().queryAndLoadNewPatch();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSophix$lambda$0(int i10, int i11, String str, int i12) {
        if (i11 == 1) {
            Log.i("Sophix", "sophix load patch success!");
        } else {
            if (i11 != 12) {
                return;
            }
            Log.i("Sophix", "sophix preload patch success. restart app to make effect.");
        }
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        MultiDex.install(this);
        initSophix();
    }
}
