.class public final synthetic Lc5/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/text/input/TextInputService;

.field public final synthetic b:Landroidx/compose/ui/focus/FocusManager;

.field public final synthetic c:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/text/input/TextInputService;Landroidx/compose/ui/focus/FocusManager;Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc5/f;->a:Landroidx/compose/ui/text/input/TextInputService;

    iput-object p2, p0, Lc5/f;->b:Landroidx/compose/ui/focus/FocusManager;

    iput-object p3, p0, Lc5/f;->c:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lc5/f;->a:Landroidx/compose/ui/text/input/TextInputService;

    iget-object v1, p0, Lc5/f;->b:Landroidx/compose/ui/focus/FocusManager;

    iget-object v2, p0, Lc5/f;->c:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, v2, p1}, Lcom/zykj/study/ui/home/my/card/AuthorizationSearchListKt;->h(Landroidx/compose/ui/text/input/TextInputService;Landroidx/compose/ui/focus/FocusManager;Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;Ljava/lang/String;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
