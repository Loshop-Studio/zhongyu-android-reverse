.class public final synthetic Lf5/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Lcom/zykj/study/view/CustomX5WebView;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/view/CustomX5WebView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf5/f;->a:Lcom/zykj/study/view/CustomX5WebView;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lf5/f;->a:Lcom/zykj/study/view/CustomX5WebView;

    check-cast p1, Landroid/graphics/RectF;

    invoke-static {v0, p1}, Lcom/zykj/study/view/CustomX5WebView;->d(Lcom/zykj/study/view/CustomX5WebView;Landroid/graphics/RectF;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
