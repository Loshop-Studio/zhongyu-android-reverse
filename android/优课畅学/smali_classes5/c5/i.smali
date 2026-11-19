.class public final synthetic Lc5/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/Modifier;

.field public final synthetic b:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

.field public final synthetic c:Lx7/p;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;Lx7/p;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc5/i;->a:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lc5/i;->b:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

    iput-object p3, p0, Lc5/i;->c:Lx7/p;

    iput p4, p0, Lc5/i;->d:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lc5/i;->a:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lc5/i;->b:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

    iget-object v2, p0, Lc5/i;->c:Lx7/p;

    iget v3, p0, Lc5/i;->d:I

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static/range {v0 .. v5}, Lcom/zykj/study/ui/home/my/card/AuthorizationSearchListKt;->a(Landroidx/compose/ui/Modifier;Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;Lx7/p;ILandroidx/compose/runtime/Composer;I)Lh7/p;

    move-result-object p1

    return-object p1
.end method
