.class public final synthetic Lo6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel;

.field public final synthetic b:Landroidx/navigation/NavController;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel;Landroidx/navigation/NavController;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo6/c;->a:Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel;

    iput-object p2, p0, Lo6/c;->b:Landroidx/navigation/NavController;

    iput-wide p3, p0, Lo6/c;->c:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lo6/c;->a:Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel;

    iget-object v1, p0, Lo6/c;->b:Landroidx/navigation/NavController;

    iget-wide v2, p0, Lo6/c;->c:J

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-static/range {v0 .. v5}, Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuidePageKt;->a(Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel;Landroidx/navigation/NavController;JJ)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
