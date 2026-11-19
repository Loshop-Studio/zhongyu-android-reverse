package com.taobao.agoo;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.camera.video.AudioStats;
import com.alibaba.sdk.android.push.impl.HuaweiMsgParseImpl;
import com.alibaba.sdk.android.push.impl.MeizuMsgParseImpl;
import com.alibaba.sdk.android.push.impl.OppoMsgParseImpl;
import com.alibaba.sdk.android.push.impl.VivoMsgParseImpl;
import com.alibaba.sdk.android.push.impl.XiaoMiMsgParseImpl;
import com.alibaba.sdk.android.push.register.ReporterFactory;
import com.alibaba.sdk.android.push.utils.ThreadUtil;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.AppMonitorAdapter;
import com.taobao.agoo.BaseNotifyClickActivity;
import java.util.Iterator;
import java.util.Set;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.MsgDO;

/* loaded from: classes5.dex */
public abstract class BaseNotifyClick {
    private static final String TAG = "MPS.BaseNotifyClick";
    private Context context;
    private String msgSource;

    private void buildMessage(final Intent intent) {
        ThreadUtil.getExecutor().execute(new Runnable() { // from class: com.taobao.agoo.BaseNotifyClick.1
            @Override // java.lang.Runnable
            public void run() {
                String msgByThirdPush;
                Intent msg = null;
                try {
                    Intent intent2 = intent;
                    if (intent2 != null) {
                        try {
                            msgByThirdPush = BaseNotifyClick.this.parseMsgByThirdPush(intent2);
                        } catch (Throwable unused) {
                            msgByThirdPush = null;
                        }
                        if (TextUtils.isEmpty(msgByThirdPush) || TextUtils.isEmpty(BaseNotifyClick.this.msgSource)) {
                            BaseNotifyClick.this.onNotPushData(intent);
                            ALog.m10122w(BaseNotifyClick.TAG, "parseMsgFromNotifyListener null!!", "source", BaseNotifyClick.this.msgSource);
                        } else {
                            try {
                                msg = ReporterFactory.getPushParser().parseMsg(BaseNotifyClick.this.context, msgByThirdPush, BaseNotifyClick.this.msgSource);
                            } catch (Throwable unused2) {
                            }
                            if (msg == null) {
                                BaseNotifyClick.this.onParseFailed(intent);
                            } else {
                                BaseNotifyClick.this.reportClickNotifyMsg(msg);
                            }
                        }
                    }
                    if (msg != null) {
                        try {
                            BaseNotifyClick.this.onMessage(msg);
                        } catch (Throwable th) {
                            ALog.m10117e(BaseNotifyClick.TAG, "onMessage", th, new Object[0]);
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        ALog.m10117e(BaseNotifyClick.TAG, "buildMessage", th2, new Object[0]);
                        if (0 != 0) {
                            try {
                                BaseNotifyClick.this.onMessage(null);
                            } catch (Throwable th3) {
                                ALog.m10117e(BaseNotifyClick.TAG, "onMessage", th3, new Object[0]);
                            }
                        }
                    } catch (Throwable th4) {
                        if (0 != 0) {
                            try {
                                BaseNotifyClick.this.onMessage(null);
                            } catch (Throwable th5) {
                                ALog.m10117e(BaseNotifyClick.TAG, "onMessage", th5, new Object[0]);
                            }
                        }
                        throw th4;
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String parseMsgByThirdPush(Intent intent) {
        String msgFromIntent;
        Set<BaseNotifyClickActivity.INotifyListener> set = BaseNotifyClickActivity.notifyListeners;
        if (set != null && set.size() > 0) {
            Iterator<BaseNotifyClickActivity.INotifyListener> it = BaseNotifyClickActivity.notifyListeners.iterator();
            msgFromIntent = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                BaseNotifyClickActivity.INotifyListener next = it.next();
                String msgFromIntent2 = next.parseMsgFromIntent(intent);
                if (!TextUtils.isEmpty(msgFromIntent2)) {
                    this.msgSource = next.getMsgSource();
                    msgFromIntent = msgFromIntent2;
                    break;
                }
                msgFromIntent = msgFromIntent2;
            }
        } else {
            ALog.m10122w(TAG, "no impl, try use default impl to parse intent!", new Object[0]);
            BaseNotifyClickActivity.INotifyListener huaweiMsgParseImpl = new HuaweiMsgParseImpl();
            msgFromIntent = huaweiMsgParseImpl.parseMsgFromIntent(intent);
            BaseNotifyClickActivity.INotifyListener iNotifyListener = huaweiMsgParseImpl;
            if (TextUtils.isEmpty(msgFromIntent)) {
                BaseNotifyClickActivity.INotifyListener xiaoMiMsgParseImpl = new XiaoMiMsgParseImpl();
                msgFromIntent = xiaoMiMsgParseImpl.parseMsgFromIntent(intent);
                iNotifyListener = xiaoMiMsgParseImpl;
            }
            BaseNotifyClickActivity.INotifyListener iNotifyListener2 = iNotifyListener;
            if (TextUtils.isEmpty(msgFromIntent)) {
                BaseNotifyClickActivity.INotifyListener oppoMsgParseImpl = new OppoMsgParseImpl();
                msgFromIntent = oppoMsgParseImpl.parseMsgFromIntent(intent);
                iNotifyListener2 = oppoMsgParseImpl;
            }
            BaseNotifyClickActivity.INotifyListener iNotifyListener3 = iNotifyListener2;
            if (TextUtils.isEmpty(msgFromIntent)) {
                VivoMsgParseImpl vivoMsgParseImpl = new VivoMsgParseImpl();
                vivoMsgParseImpl.setContext(this.context);
                msgFromIntent = vivoMsgParseImpl.parseMsgFromIntent(intent);
                iNotifyListener3 = vivoMsgParseImpl;
            }
            BaseNotifyClickActivity.INotifyListener iNotifyListener4 = iNotifyListener3;
            if (TextUtils.isEmpty(msgFromIntent)) {
                BaseNotifyClickActivity.INotifyListener meizuMsgParseImpl = new MeizuMsgParseImpl();
                msgFromIntent = meizuMsgParseImpl.parseMsgFromIntent(intent);
                iNotifyListener4 = meizuMsgParseImpl;
            }
            if (TextUtils.isEmpty(msgFromIntent)) {
                AppMonitorAdapter.commitCount("accs", "error", "parse 3push error", AudioStats.AUDIO_AMPLITUDE_NONE);
            } else {
                this.msgSource = iNotifyListener4.getMsgSource();
                AppMonitorAdapter.commitCount("accs", "error", "parse 3push default " + this.msgSource, AudioStats.AUDIO_AMPLITUDE_NONE);
            }
        }
        ALog.m10119i(TAG, "parseMsgByThirdPush", "result", msgFromIntent, "msgSource", this.msgSource);
        return msgFromIntent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportClickNotifyMsg(Intent intent) {
        try {
            String stringExtra = intent.getStringExtra(AgooConstants.MESSAGE_ID);
            String stringExtra2 = intent.getStringExtra(AgooConstants.MESSAGE_SOURCE);
            String stringExtra3 = intent.getStringExtra(AgooConstants.MESSAGE_REPORT);
            String stringExtra4 = intent.getStringExtra(AgooConstants.MESSAGE_EXT);
            MsgDO msgDO = new MsgDO();
            msgDO.msgIds = stringExtra;
            msgDO.extData = stringExtra4;
            msgDO.messageSource = stringExtra2;
            msgDO.reportStr = stringExtra3;
            msgDO.msgStatus = "8";
            ALog.m10119i(TAG, "reportClickNotifyMsg messageId:" + stringExtra + " source:" + stringExtra2 + " reportStr:" + stringExtra3 + " status:" + msgDO.msgStatus, new Object[0]);
            ReporterFactory.getPushReporter().reportPushClick(this.context, msgDO);
        } catch (Exception e10) {
            ALog.m10118e(TAG, "reportClickNotifyMsg exception: " + e10, new Object[0]);
        }
    }

    public void onCreate(Context context, Intent intent) {
        ALog.m10119i(TAG, "onCreate", new Object[0]);
        this.context = context;
        buildMessage(intent);
    }

    public abstract void onMessage(Intent intent);

    public void onNewIntent(Intent intent) {
        ALog.m10119i(TAG, "onNewIntent", new Object[0]);
        buildMessage(intent);
    }

    public void onNotPushData(Intent intent) {
    }

    public void onParseFailed(Intent intent) {
    }
}
