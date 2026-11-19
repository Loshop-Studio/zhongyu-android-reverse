.class public abstract Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/METValidator;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public errorMessage:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/METValidator;->errorMessage:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getErrorMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/METValidator;->errorMessage:Ljava/lang/String;

    return-object v0
.end method

.method public abstract isValid(Ljava/lang/CharSequence;Z)Z
.end method

.method public setErrorMessage(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/validation/METValidator;->errorMessage:Ljava/lang/String;

    return-void
.end method
