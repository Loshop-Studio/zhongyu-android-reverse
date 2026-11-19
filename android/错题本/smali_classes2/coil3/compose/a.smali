.class public final synthetic Lcoil3/compose/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:Lm/a;

.field public final synthetic b:Landroidx/compose/ui/Modifier;

.field public final synthetic c:Lr6/c;

.field public final synthetic d:Lr6/c;

.field public final synthetic e:Landroidx/compose/ui/Alignment;

.field public final synthetic f:Landroidx/compose/ui/layout/ContentScale;

.field public final synthetic g:I

.field public final synthetic h:I

.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(Lm/a;Landroidx/compose/ui/Modifier;Lr6/c;Lr6/c;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcoil3/compose/a;->a:Lm/a;

    iput-object p2, p0, Lcoil3/compose/a;->b:Landroidx/compose/ui/Modifier;

    iput-object p3, p0, Lcoil3/compose/a;->c:Lr6/c;

    iput-object p4, p0, Lcoil3/compose/a;->d:Lr6/c;

    iput-object p5, p0, Lcoil3/compose/a;->e:Landroidx/compose/ui/Alignment;

    iput-object p6, p0, Lcoil3/compose/a;->f:Landroidx/compose/ui/layout/ContentScale;

    iput p7, p0, Lcoil3/compose/a;->g:I

    iput p8, p0, Lcoil3/compose/a;->h:I

    iput p9, p0, Lcoil3/compose/a;->i:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    move-object v7, p1

    .line 2
    check-cast v7, Landroidx/compose/runtime/Composer;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lcoil3/compose/a;->h:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 14
    .line 15
    .line 16
    move-result v8

    .line 17
    iget p1, p0, Lcoil3/compose/a;->i:I

    .line 18
    .line 19
    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 20
    .line 21
    .line 22
    move-result v9

    .line 23
    iget-object v0, p0, Lcoil3/compose/a;->a:Lm/a;

    .line 24
    .line 25
    iget-object v1, p0, Lcoil3/compose/a;->b:Landroidx/compose/ui/Modifier;

    .line 26
    .line 27
    iget-object v2, p0, Lcoil3/compose/a;->c:Lr6/c;

    .line 28
    .line 29
    iget-object v3, p0, Lcoil3/compose/a;->d:Lr6/c;

    .line 30
    .line 31
    iget-object v4, p0, Lcoil3/compose/a;->e:Landroidx/compose/ui/Alignment;

    .line 32
    .line 33
    iget-object v5, p0, Lcoil3/compose/a;->f:Landroidx/compose/ui/layout/ContentScale;

    .line 34
    .line 35
    iget v6, p0, Lcoil3/compose/a;->g:I

    .line 36
    .line 37
    invoke-static/range {v0 .. v9}, Lcoil3/compose/b;->a(Lm/a;Landroidx/compose/ui/Modifier;Lr6/c;Lr6/c;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;ILandroidx/compose/runtime/Composer;II)V

    .line 38
    .line 39
    .line 40
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 41
    .line 42
    return-object p1
.end method
