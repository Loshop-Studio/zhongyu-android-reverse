.class public final synthetic Ls6/m2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Ljava/lang/Long;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;

.field public final synthetic e:Lkotlin/jvm/functions/Function0;

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(ZLjava/util/List;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ls6/m2;->a:Z

    iput-object p2, p0, Ls6/m2;->b:Ljava/util/List;

    iput-object p3, p0, Ls6/m2;->c:Ljava/lang/Long;

    iput-object p4, p0, Ls6/m2;->d:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Ls6/m2;->e:Lkotlin/jvm/functions/Function0;

    iput p6, p0, Ls6/m2;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-boolean v0, p0, Ls6/m2;->a:Z

    iget-object v1, p0, Ls6/m2;->b:Ljava/util/List;

    iget-object v2, p0, Ls6/m2;->c:Ljava/lang/Long;

    iget-object v3, p0, Ls6/m2;->d:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Ls6/m2;->e:Lkotlin/jvm/functions/Function0;

    iget v5, p0, Ls6/m2;->f:I

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, Lcom/zykj/student/dialogue/ui/home/HomeScreensKt;->m(ZLjava/util/List;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
