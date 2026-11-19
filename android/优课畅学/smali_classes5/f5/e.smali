.class public final synthetic Lf5/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/study/view/CustomX5WebView;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/view/CustomX5WebView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf5/e;->a:Lcom/zykj/study/view/CustomX5WebView;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lf5/e;->a:Lcom/zykj/study/view/CustomX5WebView;

    invoke-static {v0}, Lcom/zykj/study/view/CustomX5WebView;->f(Lcom/zykj/study/view/CustomX5WebView;)V

    return-void
.end method
