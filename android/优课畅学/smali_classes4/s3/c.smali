.class public final synthetic Ls3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Lcom/zykj/lib/ota/CheckVersionProgressDialog;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/lib/ota/CheckVersionProgressDialog;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls3/c;->a:Lcom/zykj/lib/ota/CheckVersionProgressDialog;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ls3/c;->a:Lcom/zykj/lib/ota/CheckVersionProgressDialog;

    check-cast p1, Lcom/zykj/base/bean/toast/ToastMessage;

    invoke-static {v0, p1}, Lcom/zykj/lib/ota/CheckVersionProgressDialog;->g(Lcom/zykj/lib/ota/CheckVersionProgressDialog;Lcom/zykj/base/bean/toast/ToastMessage;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
