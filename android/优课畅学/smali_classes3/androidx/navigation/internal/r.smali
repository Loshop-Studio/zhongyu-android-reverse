.class public final synthetic Landroidx/navigation/internal/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Lkotlin/jvm/internal/Ref$BooleanRef;

.field public final synthetic b:Lkotlin/jvm/internal/Ref$BooleanRef;

.field public final synthetic c:Landroidx/navigation/internal/NavControllerImpl;

.field public final synthetic d:Z

.field public final synthetic e:Li7/m;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/internal/Ref$BooleanRef;Landroidx/navigation/internal/NavControllerImpl;ZLi7/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/navigation/internal/r;->a:Lkotlin/jvm/internal/Ref$BooleanRef;

    iput-object p2, p0, Landroidx/navigation/internal/r;->b:Lkotlin/jvm/internal/Ref$BooleanRef;

    iput-object p3, p0, Landroidx/navigation/internal/r;->c:Landroidx/navigation/internal/NavControllerImpl;

    iput-boolean p4, p0, Landroidx/navigation/internal/r;->d:Z

    iput-object p5, p0, Landroidx/navigation/internal/r;->e:Li7/m;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/navigation/internal/r;->a:Lkotlin/jvm/internal/Ref$BooleanRef;

    iget-object v1, p0, Landroidx/navigation/internal/r;->b:Lkotlin/jvm/internal/Ref$BooleanRef;

    iget-object v2, p0, Landroidx/navigation/internal/r;->c:Landroidx/navigation/internal/NavControllerImpl;

    iget-boolean v3, p0, Landroidx/navigation/internal/r;->d:Z

    iget-object v4, p0, Landroidx/navigation/internal/r;->e:Li7/m;

    move-object v5, p1

    check-cast v5, Landroidx/navigation/NavBackStackEntry;

    invoke-static/range {v0 .. v5}, Landroidx/navigation/internal/NavControllerImpl;->o(Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/internal/Ref$BooleanRef;Landroidx/navigation/internal/NavControllerImpl;ZLi7/m;Landroidx/navigation/NavBackStackEntry;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
