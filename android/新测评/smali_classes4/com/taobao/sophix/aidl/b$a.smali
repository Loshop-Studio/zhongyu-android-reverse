.class public abstract Lcom/taobao/sophix/aidl/b$a;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Lcom/taobao/sophix/aidl/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/taobao/sophix/aidl/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/taobao/sophix/aidl/b$a$a;
    }
.end annotation


# direct methods
.method public static a()Lcom/taobao/sophix/aidl/b;
    .locals 1

    .line 5
    sget-object v0, Lcom/taobao/sophix/aidl/b$a$a;->a:Lcom/taobao/sophix/aidl/b;

    return-object v0
.end method

.method public static a(Landroid/os/IBinder;)Lcom/taobao/sophix/aidl/b;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 1
    :cond_0
    const-string v0, "com.taobao.sophix.aidl.IPatchStatusCallback"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2
    instance-of v1, v0, Lcom/taobao/sophix/aidl/b;

    if-eqz v1, :cond_1

    .line 3
    check-cast v0, Lcom/taobao/sophix/aidl/b;

    return-object v0

    .line 4
    :cond_1
    new-instance v0, Lcom/taobao/sophix/aidl/b$a$a;

    invoke-direct {v0, p0}, Lcom/taobao/sophix/aidl/b$a$a;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method


# virtual methods
.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 3

    .line 1
    const-string v0, "com.taobao.sophix.aidl.IPatchStatusCallback"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq p1, v1, :cond_1

    .line 5
    .line 6
    const v2, 0x5f4e5446

    .line 7
    .line 8
    .line 9
    if-eq p1, v2, :cond_0

    .line 10
    .line 11
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1

    .line 16
    :cond_0
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 28
    .line 29
    .line 30
    move-result p4

    .line 31
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    invoke-interface {p0, p1, p4, v0, p2}, Lcom/taobao/sophix/aidl/b;->a(IILjava/lang/String;I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 43
    .line 44
    .line 45
    return v1
.end method
