.class public Lcom/xuexiang/xui/widget/picker/widget/utils/PickerViewAnimateUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final INVALID:I = -0x1


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "u can\'t instantiate me..."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static getAnimationResource(IZ)I
    .locals 1

    const/16 v0, 0x50

    if-eq p0, v0, :cond_0

    const/4 p0, -0x1

    return p0

    :cond_0
    if-eqz p1, :cond_1

    sget p0, Lcom/xuexiang/xui/R$anim;->picker_view_slide_in_bottom:I

    goto :goto_0

    :cond_1
    sget p0, Lcom/xuexiang/xui/R$anim;->picker_view_slide_out_bottom:I

    :goto_0
    return p0
.end method
