.class public final synthetic Lr4/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:J

.field public final synthetic c:J

.field public final synthetic d:Lr6/a;

.field public final synthetic e:Landroidx/compose/ui/Modifier;

.field public final synthetic f:I

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;JJLr6/a;Landroidx/compose/ui/Modifier;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr4/b;->a:Ljava/lang/String;

    iput-wide p2, p0, Lr4/b;->b:J

    iput-wide p4, p0, Lr4/b;->c:J

    iput-object p6, p0, Lr4/b;->d:Lr6/a;

    iput-object p7, p0, Lr4/b;->e:Landroidx/compose/ui/Modifier;

    iput p8, p0, Lr4/b;->f:I

    iput p9, p0, Lr4/b;->g:I

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
    iget p1, p0, Lr4/b;->f:I

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
    iget-object v0, p0, Lr4/b;->a:Ljava/lang/String;

    .line 18
    .line 19
    iget-wide v1, p0, Lr4/b;->b:J

    .line 20
    .line 21
    iget-wide v3, p0, Lr4/b;->c:J

    .line 22
    .line 23
    iget-object v5, p0, Lr4/b;->d:Lr6/a;

    .line 24
    .line 25
    iget-object v6, p0, Lr4/b;->e:Landroidx/compose/ui/Modifier;

    .line 26
    .line 27
    iget v9, p0, Lr4/b;->g:I

    .line 28
    .line 29
    invoke-static/range {v0 .. v9}, Lr4/c;->a(Ljava/lang/String;JJLr6/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    .line 30
    .line 31
    .line 32
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 33
    .line 34
    return-object p1
.end method
