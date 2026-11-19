.class public final synthetic Ll6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/ui/guide/normal/done/DoneGuideViewModel;

.field public final synthetic b:Landroidx/navigation/NavController;

.field public final synthetic c:J

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/evaluation/ui/guide/normal/done/DoneGuideViewModel;Landroidx/navigation/NavController;JZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll6/a;->a:Lcom/zykj/evaluation/ui/guide/normal/done/DoneGuideViewModel;

    iput-object p2, p0, Ll6/a;->b:Landroidx/navigation/NavController;

    iput-wide p3, p0, Ll6/a;->c:J

    iput-boolean p5, p0, Ll6/a;->d:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Ll6/a;->a:Lcom/zykj/evaluation/ui/guide/normal/done/DoneGuideViewModel;

    iget-object v1, p0, Ll6/a;->b:Landroidx/navigation/NavController;

    iget-wide v2, p0, Ll6/a;->c:J

    iget-boolean v4, p0, Ll6/a;->d:Z

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-static/range {v0 .. v6}, Lcom/zykj/evaluation/ui/guide/normal/done/DoneGuidePageKt;->b(Lcom/zykj/evaluation/ui/guide/normal/done/DoneGuideViewModel;Landroidx/navigation/NavController;JZJ)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
