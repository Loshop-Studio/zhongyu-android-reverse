package com.zykj.download.api;

import androidx.annotation.Keep;
import gf.InterfaceC9416i;
import gf.InterfaceC9419l;
import gf.InterfaceC9422o;
import gf.InterfaceC9424q;
import gf.InterfaceC9432y;
import je.C9741u;
import p309qc.C10786q;
import vc.InterfaceC11588c;

@Keep
/* loaded from: classes6.dex */
public interface UploadApi {
    @InterfaceC9419l
    @InterfaceC9422o
    Object gridFs(@InterfaceC9432y String str, @InterfaceC9416i("Authorization") String str2, @InterfaceC9416i("Checksum") String str3, @InterfaceC9424q C9741u.c cVar, InterfaceC11588c<? super C10786q> interfaceC11588c);

    @InterfaceC9419l
    @InterfaceC9422o
    Object zyFs(@InterfaceC9432y String str, @InterfaceC9416i("Authorization") String str2, @InterfaceC9416i("Checksum") String str3, @InterfaceC9424q C9741u.c cVar, InterfaceC11588c<? super C10786q> interfaceC11588c);
}
