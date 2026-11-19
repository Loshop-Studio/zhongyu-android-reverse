package com.umeng.commonsdk.statistics.noise;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.idtracking.Envelope;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.InterfaceC2013d;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import org.android.agoo.message.MessageService;

/* loaded from: classes.dex */
public class ABTest implements InterfaceC2013d {
    private static ABTest instance;
    private Context context;
    private boolean isInTest = false;
    private int mPolicy = -1;
    private int mInterval = -1;
    private int mGroup = -1;
    private float mProb13 = IGoodView.DEFAULT_TO_ALPHA;
    private float mProb07 = IGoodView.DEFAULT_TO_ALPHA;
    private String mPoli = null;

    private ABTest(Context context, String str, int i4) {
        this.context = context;
        onExperimentChanged(str, i4);
    }

    public static synchronized ABTest getService(Context context) {
        if (instance == null) {
            instance = new ABTest(context, UMEnvelopeBuild.imprintProperty(context, "client_test", null), Integer.valueOf(UMEnvelopeBuild.imprintProperty(context, "test_report_interval", MessageService.MSG_DB_READY_REPORT)).intValue());
        }
        return instance;
    }

    private void parseFIXED(String str) {
        if (str == null) {
            return;
        }
        String[] strArrSplit = str.split("\\|");
        float fFloatValue = IGoodView.DEFAULT_TO_ALPHA;
        if (strArrSplit[2].equals("SIG13")) {
            fFloatValue = Float.valueOf(strArrSplit[3]).floatValue();
        }
        if (this.mProb13 > fFloatValue) {
            this.isInTest = false;
            return;
        }
        int iIntValue = strArrSplit[0].equals("FIXED") ? Integer.valueOf(strArrSplit[1]).intValue() : -1;
        int[] iArr = null;
        if (strArrSplit[4].equals("RPT")) {
            this.mPoli = "RPT";
            String[] strArrSplit2 = strArrSplit[5].split(",");
            iArr = new int[strArrSplit2.length];
            for (int i4 = 0; i4 < strArrSplit2.length; i4++) {
                iArr[i4] = Integer.valueOf(strArrSplit2[i4]).intValue();
            }
        } else if (strArrSplit[4].equals("DOM")) {
            this.mPoli = "DOM";
            this.isInTest = true;
            try {
                String[] strArrSplit3 = strArrSplit[5].split(",");
                iArr = new int[strArrSplit3.length];
                for (int i5 = 0; i5 < strArrSplit3.length; i5++) {
                    iArr[i5] = Integer.valueOf(strArrSplit3[i5]).intValue();
                }
            } catch (Exception unused) {
            }
        }
        if (iIntValue == -1) {
            this.isInTest = false;
            return;
        }
        this.isInTest = true;
        this.mGroup = iIntValue;
        if (iArr != null) {
            this.mPolicy = iArr[iIntValue - 1];
        }
    }

    private void parseSig7(String str) {
        float[] fArr;
        if (str == null) {
            return;
        }
        String[] strArrSplit = str.split("\\|");
        boolean zEquals = strArrSplit[2].equals("SIG13");
        float f4 = IGoodView.DEFAULT_TO_ALPHA;
        if (this.mProb13 > (zEquals ? Float.valueOf(strArrSplit[3]).floatValue() : IGoodView.DEFAULT_TO_ALPHA)) {
            this.isInTest = false;
            return;
        }
        int[] iArr = null;
        if (strArrSplit[0].equals("SIG7")) {
            String[] strArrSplit2 = strArrSplit[1].split(",");
            fArr = new float[strArrSplit2.length];
            for (int i4 = 0; i4 < strArrSplit2.length; i4++) {
                fArr[i4] = Float.valueOf(strArrSplit2[i4]).floatValue();
            }
        } else {
            fArr = null;
        }
        if (strArrSplit[4].equals("RPT")) {
            this.mPoli = "RPT";
            String[] strArrSplit3 = strArrSplit[5].split(",");
            iArr = new int[strArrSplit3.length];
            for (int i5 = 0; i5 < strArrSplit3.length; i5++) {
                iArr[i5] = Integer.valueOf(strArrSplit3[i5]).intValue();
            }
        } else if (strArrSplit[4].equals("DOM")) {
            this.isInTest = true;
            this.mPoli = "DOM";
            try {
                String[] strArrSplit4 = strArrSplit[5].split(",");
                iArr = new int[strArrSplit4.length];
                for (int i6 = 0; i6 < strArrSplit4.length; i6++) {
                    iArr[i6] = Integer.valueOf(strArrSplit4[i6]).intValue();
                }
            } catch (Exception unused) {
            }
        }
        int i7 = 0;
        while (true) {
            if (i7 >= fArr.length) {
                i7 = -1;
                break;
            }
            f4 += fArr[i7];
            if (this.mProb07 < f4) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 == -1) {
            this.isInTest = false;
            return;
        }
        this.isInTest = true;
        this.mGroup = i7 + 1;
        if (iArr != null) {
            this.mPolicy = iArr[i7];
        }
    }

    private float prob(String str, int i4) {
        int i5 = i4 * 2;
        return str == null ? IGoodView.DEFAULT_TO_ALPHA : Integer.valueOf(str.substring(i5, i5 + 5), 16).intValue() / 1048576.0f;
    }

    public static boolean validate(String str) throws NumberFormatException {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String[] strArrSplit = str.split("\\|");
        if (strArrSplit.length != 6) {
            return false;
        }
        if (strArrSplit[0].startsWith("SIG7") && strArrSplit[1].split(",").length == strArrSplit[5].split(",").length) {
            return true;
        }
        if (strArrSplit[0].startsWith("FIXED")) {
            int length = strArrSplit[5].split(",").length;
            int i4 = Integer.parseInt(strArrSplit[1]);
            if (length >= i4 && i4 >= 1) {
                return true;
            }
        }
        return false;
    }

    public int getGroup() {
        return this.mGroup;
    }

    public String getGroupInfo() {
        return !this.isInTest ? "error" : String.valueOf(this.mGroup);
    }

    public int getTestInterval() {
        return this.mInterval;
    }

    public String getTestName() {
        return this.mPoli;
    }

    public int getTestPolicy() {
        return this.mPolicy;
    }

    public boolean isInTest() {
        return this.isInTest;
    }

    public void onExperimentChanged(String str, int i4) {
        this.mInterval = i4;
        String signature = Envelope.getSignature(this.context);
        if (TextUtils.isEmpty(signature) || TextUtils.isEmpty(str)) {
            this.isInTest = false;
            return;
        }
        try {
            this.mProb13 = prob(signature, 12);
            this.mProb07 = prob(signature, 6);
            if (str.startsWith("SIG7")) {
                parseSig7(str);
            } else if (str.startsWith("FIXED")) {
                parseFIXED(str);
            }
        } catch (Exception e4) {
            this.isInTest = false;
            MLog.m7572e("v:" + str, e4);
        }
    }

    @Override // com.umeng.commonsdk.statistics.internal.InterfaceC2013d
    public void onImprintChanged(ImprintHandler.C1995a c1995a) {
        onExperimentChanged(c1995a.m7676a("client_test", null), Integer.valueOf(c1995a.m7676a("test_report_interval", MessageService.MSG_DB_READY_REPORT)).intValue());
    }

    public String toString() {
        return " p13:" + this.mProb13 + " p07:" + this.mProb07 + " policy:" + this.mPolicy + " interval:" + this.mInterval;
    }
}
