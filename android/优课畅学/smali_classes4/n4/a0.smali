.class public final synthetic Ln4/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln4/a0;->a:Ljava/lang/String;

    iput-object p2, p0, Ln4/a0;->b:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Ln4/a0;->a:Ljava/lang/String;

    iget-object v1, p0, Ln4/a0;->b:Landroid/view/View;

    invoke-static {v0, v1}, Lcom/zykj/study/adapter/FreeSubscribeAdapter;->d(Ljava/lang/String;Landroid/view/View;)Lh7/p;

    move-result-object v0

    return-object v0
.end method
