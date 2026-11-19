.class public final synthetic Ln4/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Lcom/zykj/study/adapter/ChartBarAdapter$ViewHolder;

.field public final synthetic b:Lcom/zykj/study/adapter/ChartBarAdapter;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/adapter/ChartBarAdapter$ViewHolder;Lcom/zykj/study/adapter/ChartBarAdapter;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln4/r;->a:Lcom/zykj/study/adapter/ChartBarAdapter$ViewHolder;

    iput-object p2, p0, Ln4/r;->b:Lcom/zykj/study/adapter/ChartBarAdapter;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Ln4/r;->a:Lcom/zykj/study/adapter/ChartBarAdapter$ViewHolder;

    iget-object v1, p0, Ln4/r;->b:Lcom/zykj/study/adapter/ChartBarAdapter;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, v1, p1}, Lcom/zykj/study/adapter/ChartBarAdapter$ViewHolder;->b(Lcom/zykj/study/adapter/ChartBarAdapter$ViewHolder;Lcom/zykj/study/adapter/ChartBarAdapter;Landroid/view/View;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
