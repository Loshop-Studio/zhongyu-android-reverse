.class public Lcom/xuexiang/xui/widget/edittext/AsteriskPasswordTransformationMethod;
.super Landroid/text/method/PasswordTransformationMethod;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/edittext/AsteriskPasswordTransformationMethod$AsteriskPasswordCharSequence;
    }
.end annotation


# static fields
.field private static sInstance:Lcom/xuexiang/xui/widget/edittext/AsteriskPasswordTransformationMethod;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/text/method/PasswordTransformationMethod;-><init>()V

    return-void
.end method

.method public static getInstance()Landroid/text/method/PasswordTransformationMethod;
    .locals 1

    .line 1
    sget-object v0, Lcom/xuexiang/xui/widget/edittext/AsteriskPasswordTransformationMethod;->sInstance:Lcom/xuexiang/xui/widget/edittext/AsteriskPasswordTransformationMethod;

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    new-instance v0, Lcom/xuexiang/xui/widget/edittext/AsteriskPasswordTransformationMethod;

    invoke-direct {v0}, Lcom/xuexiang/xui/widget/edittext/AsteriskPasswordTransformationMethod;-><init>()V

    sput-object v0, Lcom/xuexiang/xui/widget/edittext/AsteriskPasswordTransformationMethod;->sInstance:Lcom/xuexiang/xui/widget/edittext/AsteriskPasswordTransformationMethod;

    return-object v0
.end method


# virtual methods
.method public getTransformation(Ljava/lang/CharSequence;Landroid/view/View;)Ljava/lang/CharSequence;
    .locals 0

    new-instance p2, Lcom/xuexiang/xui/widget/edittext/AsteriskPasswordTransformationMethod$AsteriskPasswordCharSequence;

    invoke-direct {p2, p1}, Lcom/xuexiang/xui/widget/edittext/AsteriskPasswordTransformationMethod$AsteriskPasswordCharSequence;-><init>(Ljava/lang/CharSequence;)V

    return-object p2
.end method
