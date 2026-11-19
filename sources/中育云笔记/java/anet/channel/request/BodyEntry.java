package anet.channel.request;

import android.os.Parcelable;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public interface BodyEntry extends Parcelable {
    String getContentType();

    int writeTo(OutputStream outputStream);
}
