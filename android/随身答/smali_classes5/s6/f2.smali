.class public final synthetic Ls6/f2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:I

.field public final synthetic c:J

.field public final synthetic d:J

.field public final synthetic e:Z

.field public final synthetic f:Z

.field public final synthetic g:Lkotlin/jvm/functions/Function0;

.field public final synthetic h:I

.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;IJJZZLkotlin/jvm/functions/Function0;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls6/f2;->a:Ljava/lang/String;

    iput p2, p0, Ls6/f2;->b:I

    iput-wide p3, p0, Ls6/f2;->c:J

    iput-wide p5, p0, Ls6/f2;->d:J

    iput-boolean p7, p0, Ls6/f2;->e:Z

    iput-boolean p8, p0, Ls6/f2;->f:Z

    iput-object p9, p0, Ls6/f2;->g:Lkotlin/jvm/functions/Function0;

    iput p10, p0, Ls6/f2;->h:I

    iput p11, p0, Ls6/f2;->i:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-object v0, p0, Ls6/f2;->a:Ljava/lang/String;

    iget v1, p0, Ls6/f2;->b:I

    iget-wide v2, p0, Ls6/f2;->c:J

    iget-wide v4, p0, Ls6/f2;->d:J

    iget-boolean v6, p0, Ls6/f2;->e:Z

    iget-boolean v7, p0, Ls6/f2;->f:Z

    iget-object v8, p0, Ls6/f2;->g:Lkotlin/jvm/functions/Function0;

    iget v9, p0, Ls6/f2;->h:I

    iget v10, p0, Ls6/f2;->i:I

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    invoke-static/range {v0 .. v12}, Lcom/zykj/student/dialogue/ui/home/HomeScreensKt;->g(Ljava/lang/String;IJJZZLkotlin/jvm/functions/Function0;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
