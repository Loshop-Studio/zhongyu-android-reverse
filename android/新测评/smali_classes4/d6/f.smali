.class public final synthetic Ld6/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;

.field public final synthetic c:Landroidx/navigation/NavController;


# direct methods
.method public synthetic constructor <init>(JLcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;Landroidx/navigation/NavController;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ld6/f;->a:J

    iput-object p3, p0, Ld6/f;->b:Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;

    iput-object p4, p0, Ld6/f;->c:Landroidx/navigation/NavController;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-wide v0, p0, Ld6/f;->a:J

    iget-object v2, p0, Ld6/f;->b:Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;

    iget-object v3, p0, Ld6/f;->c:Landroidx/navigation/NavController;

    move-object v4, p1

    check-cast v4, Ljava/lang/String;

    move-object v5, p2

    check-cast v5, Ljava/lang/String;

    invoke-static/range {v0 .. v5}, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailPageKt;->j(JLcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;Landroidx/navigation/NavController;Ljava/lang/String;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
