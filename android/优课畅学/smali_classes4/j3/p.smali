.class public final synthetic Lj3/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/activity/result/ActivityResultCallback;


# instance fields
.field public final synthetic a:Lcom/zykj/image/QRCodeFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/image/QRCodeFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj3/p;->a:Lcom/zykj/image/QRCodeFragment;

    return-void
.end method


# virtual methods
.method public final onActivityResult(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lj3/p;->a:Lcom/zykj/image/QRCodeFragment;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, p1}, Lcom/zykj/image/QRCodeFragment;->g(Lcom/zykj/image/QRCodeFragment;Z)V

    return-void
.end method
