package com.xuexiang.xui.widget.textview;

import android.content.Context;
import android.os.Looper;
import android.text.Layout;
import android.text.SpannableString;
import android.text.method.ScrollingMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.ResUtils;

/* loaded from: classes.dex */
public class LoggerTextView extends AppCompatTextView {
    private ILogDecorator mLogDecorator;
    private ILogFormatter mLogFormatter;

    /* renamed from: com.xuexiang.xui.widget.textview.LoggerTextView$3 */
    static /* synthetic */ class C23483 {

        /* renamed from: $SwitchMap$com$xuexiang$xui$widget$textview$LoggerTextView$LogType */
        static final /* synthetic */ int[] f9697x843c65a6;

        static {
            int[] iArr = new int[LogType.values().length];
            f9697x843c65a6 = iArr;
            try {
                iArr[LogType.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9697x843c65a6[LogType.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9697x843c65a6[LogType.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class DefaultLogDecorator implements ILogDecorator {
        @Override // com.xuexiang.xui.widget.textview.LoggerTextView.ILogDecorator
        public SpannableString decorate(String str, LogType logType) {
            SpannableString spannableString = new SpannableString(str);
            int i4 = C23483.f9697x843c65a6[logType.ordinal()];
            if (i4 == 1) {
                spannableString.setSpan(new ForegroundColorSpan(ResUtils.getColor(C2042R.color.xui_config_color_error)), 0, str.length(), 33);
            } else if (i4 == 2) {
                spannableString.setSpan(new ForegroundColorSpan(ResUtils.getColor(C2042R.color.xui_config_color_success)), 0, str.length(), 33);
            } else if (i4 == 3) {
                spannableString.setSpan(new ForegroundColorSpan(ResUtils.getColor(C2042R.color.xui_config_color_waring)), 0, str.length(), 33);
            }
            return spannableString;
        }
    }

    public static class DefaultLogFormatter implements ILogFormatter {
        @Override // com.xuexiang.xui.widget.textview.LoggerTextView.ILogFormatter
        public String format(String str, LogType logType) {
            return str;
        }
    }

    public interface ILogDecorator {
        SpannableString decorate(String str, LogType logType);
    }

    public interface ILogFormatter {
        String format(String str, LogType logType);
    }

    public enum LogType {
        NORMAL,
        SUCCESS,
        ERROR,
        WARNING,
        CUSTOM
    }

    public LoggerTextView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void appendLog(SpannableString spannableString) {
        append(spannableString);
        append("\r\n");
        scrollToEnd();
    }

    private void appendLogInMainThread(final SpannableString spannableString) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            appendLog(spannableString);
        } else {
            post(new Runnable() { // from class: com.xuexiang.xui.widget.textview.LoggerTextView.1
                @Override // java.lang.Runnable
                public void run() {
                    LoggerTextView.this.appendLog(spannableString);
                }
            });
        }
    }

    private int getTextRealHeight() {
        Layout layout = getLayout();
        return (layout != null ? layout.getLineTop(getLineCount()) : 0) + getCompoundPaddingTop() + getCompoundPaddingBottom();
    }

    private void scrollToEnd() {
        int textRealHeight = getTextRealHeight();
        if (textRealHeight > getHeight()) {
            scrollTo(0, textRealHeight - getHeight());
        }
    }

    public void addLog(String str, LogType logType) {
        appendLogInMainThread(getLogDecorator().decorate(getLogFormatter().format(str, logType), logType));
    }

    public void clearLog() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            post(new Runnable() { // from class: com.xuexiang.xui.widget.textview.LoggerTextView.2
                @Override // java.lang.Runnable
                public void run() {
                    LoggerTextView.this.setText("");
                    LoggerTextView.this.scrollTo(0, 0);
                }
            });
        } else {
            setText("");
            scrollTo(0, 0);
        }
    }

    public ILogDecorator getLogDecorator() {
        if (this.mLogDecorator == null) {
            this.mLogDecorator = new DefaultLogDecorator();
        }
        return this.mLogDecorator;
    }

    public ILogFormatter getLogFormatter() {
        if (this.mLogFormatter == null) {
            this.mLogFormatter = new DefaultLogFormatter();
        }
        return this.mLogFormatter;
    }

    public void logCustom(String str) {
        addLog(str, LogType.CUSTOM);
    }

    public void logError(String str) {
        addLog(str, LogType.ERROR);
    }

    public void logNormal(String str) {
        addLog(str, LogType.NORMAL);
    }

    public void logSuccess(String str) {
        addLog(str, LogType.SUCCESS);
    }

    public void logWarning(String str) {
        addLog(str, LogType.WARNING);
    }

    public LoggerTextView setLogDecorator(ILogDecorator iLogDecorator) {
        this.mLogDecorator = iLogDecorator;
        return this;
    }

    public LoggerTextView setLogFormatter(ILogFormatter iLogFormatter) {
        this.mLogFormatter = iLogFormatter;
        return this;
    }

    public LoggerTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2042R.attr.LoggerTextViewStyle);
    }

    public LoggerTextView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mLogFormatter = new DefaultLogFormatter();
        this.mLogDecorator = new DefaultLogDecorator();
        setMovementMethod(new ScrollingMovementMethod());
    }
}
