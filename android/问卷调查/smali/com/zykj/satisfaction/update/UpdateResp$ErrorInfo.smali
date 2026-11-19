.class public final Lcom/zykj/satisfaction/update/UpdateResp$ErrorInfo;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/satisfaction/update/UpdateResp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ErrorInfo"
.end annotation


# instance fields
.field private code:I

.field private message:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/zykj/satisfaction/update/UpdateResp$ErrorInfo;->message:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getCode()I
    .locals 1

    iget v0, p0, Lcom/zykj/satisfaction/update/UpdateResp$ErrorInfo;->code:I

    return v0
.end method

.method public final getMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/satisfaction/update/UpdateResp$ErrorInfo;->message:Ljava/lang/String;

    return-object v0
.end method

.method public final setCode(I)V
    .locals 0

    iput p1, p0, Lcom/zykj/satisfaction/update/UpdateResp$ErrorInfo;->code:I

    return-void
.end method

.method public final setMessage(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/zykj/satisfaction/update/UpdateResp$ErrorInfo;->message:Ljava/lang/String;

    return-void
.end method
