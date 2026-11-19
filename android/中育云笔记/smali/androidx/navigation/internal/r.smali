.class public final synthetic Landroidx/navigation/internal/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lkotlin/jvm/internal/Ref$BooleanRef;

.field public final synthetic d:Lkotlin/jvm/internal/Ref$BooleanRef;

.field public final synthetic e:Landroidx/navigation/internal/NavControllerImpl;

.field public final synthetic f:Z

.field public final synthetic g:Lrc/m;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/internal/Ref$BooleanRef;Landroidx/navigation/internal/NavControllerImpl;ZLrc/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/navigation/internal/r;->c:Lkotlin/jvm/internal/Ref$BooleanRef;

    iput-object p2, p0, Landroidx/navigation/internal/r;->d:Lkotlin/jvm/internal/Ref$BooleanRef;

    iput-object p3, p0, Landroidx/navigation/internal/r;->e:Landroidx/navigation/internal/NavControllerImpl;

    iput-boolean p4, p0, Landroidx/navigation/internal/r;->f:Z

    iput-object p5, p0, Landroidx/navigation/internal/r;->g:Lrc/m;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/navigation/internal/r;->c:Lkotlin/jvm/internal/Ref$BooleanRef;

    iget-object v1, p0, Landroidx/navigation/internal/r;->d:Lkotlin/jvm/internal/Ref$BooleanRef;

    iget-object v2, p0, Landroidx/navigation/internal/r;->e:Landroidx/navigation/internal/NavControllerImpl;

    iget-boolean v3, p0, Landroidx/navigation/internal/r;->f:Z

    iget-object v4, p0, Landroidx/navigation/internal/r;->g:Lrc/m;

    move-object v5, p1

    check-cast v5, Landroidx/navigation/NavBackStackEntry;

    invoke-static/range {v0 .. v5}, Landroidx/navigation/internal/NavControllerImpl;->o(Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/internal/Ref$BooleanRef;Landroidx/navigation/internal/NavControllerImpl;ZLrc/m;Landroidx/navigation/NavBackStackEntry;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
