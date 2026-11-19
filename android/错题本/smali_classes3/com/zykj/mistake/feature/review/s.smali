.class public final synthetic Lcom/zykj/mistake/feature/review/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:J

.field public final synthetic c:J

.field public final synthetic d:Landroidx/compose/ui/Modifier;

.field public final synthetic e:Lr6/a;

.field public final synthetic f:Z

.field public final synthetic g:I

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;JJLandroidx/compose/ui/Modifier;Lr6/a;ZII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/feature/review/s;->a:Ljava/lang/String;

    iput-wide p2, p0, Lcom/zykj/mistake/feature/review/s;->b:J

    iput-wide p4, p0, Lcom/zykj/mistake/feature/review/s;->c:J

    iput-object p6, p0, Lcom/zykj/mistake/feature/review/s;->d:Landroidx/compose/ui/Modifier;

    iput-object p7, p0, Lcom/zykj/mistake/feature/review/s;->e:Lr6/a;

    iput-boolean p8, p0, Lcom/zykj/mistake/feature/review/s;->f:Z

    iput p9, p0, Lcom/zykj/mistake/feature/review/s;->g:I

    iput p10, p0, Lcom/zykj/mistake/feature/review/s;->h:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    move-object v8, p1

    .line 2
    check-cast v8, Landroidx/compose/runtime/Composer;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lcom/zykj/mistake/feature/review/s;->g:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 14
    .line 15
    .line 16
    move-result v9

    .line 17
    iget-object v0, p0, Lcom/zykj/mistake/feature/review/s;->a:Ljava/lang/String;

    .line 18
    .line 19
    iget-wide v1, p0, Lcom/zykj/mistake/feature/review/s;->b:J

    .line 20
    .line 21
    iget-wide v3, p0, Lcom/zykj/mistake/feature/review/s;->c:J

    .line 22
    .line 23
    iget-object v5, p0, Lcom/zykj/mistake/feature/review/s;->d:Landroidx/compose/ui/Modifier;

    .line 24
    .line 25
    iget-object v6, p0, Lcom/zykj/mistake/feature/review/s;->e:Lr6/a;

    .line 26
    .line 27
    iget-boolean v7, p0, Lcom/zykj/mistake/feature/review/s;->f:Z

    .line 28
    .line 29
    iget v10, p0, Lcom/zykj/mistake/feature/review/s;->h:I

    .line 30
    .line 31
    invoke-static/range {v0 .. v10}, Lcom/zykj/mistake/feature/review/y;->d(Ljava/lang/String;JJLandroidx/compose/ui/Modifier;Lr6/a;ZLandroidx/compose/runtime/Composer;II)V

    .line 32
    .line 33
    .line 34
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 35
    .line 36
    return-object p1
.end method
