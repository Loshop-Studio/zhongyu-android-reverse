.class public final synthetic Ls6/i2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Z

.field public final synthetic c:Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(ZZLcom/zykj/student/dialogue/bean/resp/CatalogResp;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ls6/i2;->a:Z

    iput-boolean p2, p0, Ls6/i2;->b:Z

    iput-object p3, p0, Ls6/i2;->c:Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    iput-object p4, p0, Ls6/i2;->d:Lkotlin/jvm/functions/Function1;

    iput p5, p0, Ls6/i2;->e:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-boolean v0, p0, Ls6/i2;->a:Z

    iget-boolean v1, p0, Ls6/i2;->b:Z

    iget-object v2, p0, Ls6/i2;->c:Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    iget-object v3, p0, Ls6/i2;->d:Lkotlin/jvm/functions/Function1;

    iget v4, p0, Ls6/i2;->e:I

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lcom/zykj/student/dialogue/ui/home/HomeScreensKt;->d(ZZLcom/zykj/student/dialogue/bean/resp/CatalogResp;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
