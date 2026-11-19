.class public final synthetic Lj3/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/zykj/image/QRCodeFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/image/QRCodeFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj3/o;->a:Lcom/zykj/image/QRCodeFragment;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lj3/o;->a:Lcom/zykj/image/QRCodeFragment;

    invoke-static {v0, p1}, Lcom/zykj/image/QRCodeFragment;->i(Lcom/zykj/image/QRCodeFragment;Landroid/view/View;)V

    return-void
.end method
