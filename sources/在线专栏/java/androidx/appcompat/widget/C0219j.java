package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.text.Selection;
import android.text.Spannable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import android.widget.TextView;
import androidx.core.view.C0339c;
import androidx.core.view.C0358u;
import p079e0.C2469b;
import p079e0.C2470c;

/* renamed from: androidx.appcompat.widget.j */
/* loaded from: classes.dex */
final class C0219j {

    /* renamed from: androidx.appcompat.widget.j$a */
    class a implements C2469b.c {

        /* renamed from: a */
        final /* synthetic */ View f1123a;

        a(View view) {
            this.f1123a = view;
        }

        @Override // p079e0.C2469b.c
        /* renamed from: a */
        public boolean mo891a(C2470c c2470c, int i4, Bundle bundle) {
            if (Build.VERSION.SDK_INT >= 25 && (i4 & 1) != 0) {
                try {
                    c2470c.m8241d();
                    InputContentInfo inputContentInfo = (InputContentInfo) c2470c.m8242e();
                    bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                    bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
                } catch (Exception e4) {
                    Log.w("ReceiveContent", "Can't insert content from IME; requestPermission() failed", e4);
                    return false;
                }
            }
            return C0358u.m2031g0(this.f1123a, new C0339c.a(new ClipData(c2470c.m8239b(), new ClipData.Item(c2470c.m8238a())), 2).m1859d(c2470c.m8240c()).m1857b(bundle).m1856a()) == null;
        }
    }

    /* renamed from: androidx.appcompat.widget.j$b */
    private static final class b {
        /* renamed from: a */
        static boolean m892a(DragEvent dragEvent, TextView textView, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                C0358u.m2031g0(textView, new C0339c.a(dragEvent.getClipData(), 3).m1856a());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th) {
                textView.endBatchEdit();
                throw th;
            }
        }

        /* renamed from: b */
        static boolean m893b(DragEvent dragEvent, View view, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            C0358u.m2031g0(view, new C0339c.a(dragEvent.getClipData(), 3).m1856a());
            return true;
        }
    }

    /* renamed from: a */
    static C2469b.c m887a(View view) {
        return new a(view);
    }

    /* renamed from: b */
    static boolean m888b(View view, DragEvent dragEvent) {
        if (Build.VERSION.SDK_INT >= 24 && dragEvent.getLocalState() == null && C0358u.m1984D(view) != null) {
            Activity activityM890d = m890d(view);
            if (activityM890d == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + view);
                return false;
            }
            if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            }
            if (dragEvent.getAction() == 3) {
                return view instanceof TextView ? b.m892a(dragEvent, (TextView) view, activityM890d) : b.m893b(dragEvent, view, activityM890d);
            }
        }
        return false;
    }

    /* renamed from: c */
    static boolean m889c(TextView textView, int i4) {
        if ((i4 != 16908322 && i4 != 16908337) || C0358u.m1984D(textView) == null) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            C0358u.m2031g0(textView, new C0339c.a(primaryClip, 1).m1858c(i4 != 16908322 ? 1 : 0).m1856a());
        }
        return true;
    }

    /* renamed from: d */
    static Activity m890d(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
