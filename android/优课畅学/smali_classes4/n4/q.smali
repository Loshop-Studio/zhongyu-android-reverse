.class public final synthetic Ln4/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/study/adapter/ChartBarAdapter$ViewHolder;

.field public final synthetic b:Lcom/zykj/study/bean/teach/ChoiceChartData;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/adapter/ChartBarAdapter$ViewHolder;Lcom/zykj/study/bean/teach/ChoiceChartData;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln4/q;->a:Lcom/zykj/study/adapter/ChartBarAdapter$ViewHolder;

    iput-object p2, p0, Ln4/q;->b:Lcom/zykj/study/bean/teach/ChoiceChartData;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Ln4/q;->a:Lcom/zykj/study/adapter/ChartBarAdapter$ViewHolder;

    iget-object v1, p0, Ln4/q;->b:Lcom/zykj/study/bean/teach/ChoiceChartData;

    invoke-static {v0, v1}, Lcom/zykj/study/adapter/ChartBarAdapter$ViewHolder;->a(Lcom/zykj/study/adapter/ChartBarAdapter$ViewHolder;Lcom/zykj/study/bean/teach/ChoiceChartData;)V

    return-void
.end method
