.class public final Lcom/xuexiang/xui/widget/button/switchbutton/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton$SavedState;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 4
    .line 5
    .line 6
    sget-object v1, Landroid/text/TextUtils;->CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;

    .line 7
    .line 8
    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    check-cast v2, Ljava/lang/CharSequence;

    .line 13
    .line 14
    iput-object v2, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton$SavedState;->a:Ljava/lang/CharSequence;

    .line 15
    .line 16
    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Ljava/lang/CharSequence;

    .line 21
    .line 22
    iput-object p1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton$SavedState;->b:Ljava/lang/CharSequence;

    .line 23
    .line 24
    return-object v0
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    new-array p1, p1, [Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton$SavedState;

    .line 2
    .line 3
    return-object p1
.end method
