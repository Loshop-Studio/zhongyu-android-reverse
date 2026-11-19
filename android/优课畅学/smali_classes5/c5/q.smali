.class public final synthetic Lc5/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/Modifier;

.field public final synthetic b:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

.field public final synthetic c:Lx7/l;

.field public final synthetic d:Lx7/a;

.field public final synthetic e:I

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;Lx7/l;Lx7/a;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc5/q;->a:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lc5/q;->b:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

    iput-object p3, p0, Lc5/q;->c:Lx7/l;

    iput-object p4, p0, Lc5/q;->d:Lx7/a;

    iput p5, p0, Lc5/q;->e:I

    iput p6, p0, Lc5/q;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lc5/q;->a:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lc5/q;->b:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

    iget-object v2, p0, Lc5/q;->c:Lx7/l;

    iget-object v3, p0, Lc5/q;->d:Lx7/a;

    iget v4, p0, Lc5/q;->e:I

    iget v5, p0, Lc5/q;->f:I

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, Lcom/zykj/study/ui/home/my/card/AuthorizedResultCardKt;->c(Landroidx/compose/ui/Modifier;Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;Lx7/l;Lx7/a;IILandroidx/compose/runtime/Composer;I)Lh7/p;

    move-result-object p1

    return-object p1
.end method
