.class public final synthetic Lz2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/Observer;


# instance fields
.field public final synthetic a:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz2/a;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lz2/a;->a:Landroid/content/Context;

    check-cast p1, Lcom/zykj/base/bean/toast/ToastMessage;

    invoke-static {v0, p1}, Lcom/zykj/base/view/ToastView;->a(Landroid/content/Context;Lcom/zykj/base/bean/toast/ToastMessage;)V

    return-void
.end method
