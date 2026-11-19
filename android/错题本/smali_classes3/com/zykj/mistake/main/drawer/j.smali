.class public final synthetic Lcom/zykj/mistake/main/drawer/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:Lcom/zykj/mistake/main/a1;

.field public final synthetic b:Lr6/a;

.field public final synthetic c:Lr6/c;

.field public final synthetic d:Lr6/a;

.field public final synthetic e:Lr6/e;

.field public final synthetic f:Lr6/c;

.field public final synthetic g:Lr6/a;

.field public final synthetic h:Lr6/a;

.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/main/a1;Lr6/a;Lr6/c;Lr6/a;Lr6/e;Lr6/c;Lr6/a;Lr6/a;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/main/drawer/j;->a:Lcom/zykj/mistake/main/a1;

    iput-object p2, p0, Lcom/zykj/mistake/main/drawer/j;->b:Lr6/a;

    iput-object p3, p0, Lcom/zykj/mistake/main/drawer/j;->c:Lr6/c;

    iput-object p4, p0, Lcom/zykj/mistake/main/drawer/j;->d:Lr6/a;

    iput-object p5, p0, Lcom/zykj/mistake/main/drawer/j;->e:Lr6/e;

    iput-object p6, p0, Lcom/zykj/mistake/main/drawer/j;->f:Lr6/c;

    iput-object p7, p0, Lcom/zykj/mistake/main/drawer/j;->g:Lr6/a;

    iput-object p8, p0, Lcom/zykj/mistake/main/drawer/j;->h:Lr6/a;

    iput p9, p0, Lcom/zykj/mistake/main/drawer/j;->i:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    move-object v8, p1

    .line 2
    check-cast v8, Landroidx/compose/runtime/Composer;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lcom/zykj/mistake/main/drawer/j;->i:I

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
    iget-object v0, p0, Lcom/zykj/mistake/main/drawer/j;->a:Lcom/zykj/mistake/main/a1;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/zykj/mistake/main/drawer/j;->b:Lr6/a;

    .line 20
    .line 21
    iget-object v2, p0, Lcom/zykj/mistake/main/drawer/j;->c:Lr6/c;

    .line 22
    .line 23
    iget-object v3, p0, Lcom/zykj/mistake/main/drawer/j;->d:Lr6/a;

    .line 24
    .line 25
    iget-object v4, p0, Lcom/zykj/mistake/main/drawer/j;->e:Lr6/e;

    .line 26
    .line 27
    iget-object v5, p0, Lcom/zykj/mistake/main/drawer/j;->f:Lr6/c;

    .line 28
    .line 29
    iget-object v6, p0, Lcom/zykj/mistake/main/drawer/j;->g:Lr6/a;

    .line 30
    .line 31
    iget-object v7, p0, Lcom/zykj/mistake/main/drawer/j;->h:Lr6/a;

    .line 32
    .line 33
    invoke-static/range {v0 .. v9}, Lcom/zykj/mistake/main/drawer/l;->b(Lcom/zykj/mistake/main/a1;Lr6/a;Lr6/c;Lr6/a;Lr6/e;Lr6/c;Lr6/a;Lr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 34
    .line 35
    .line 36
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 37
    .line 38
    return-object p1
.end method
