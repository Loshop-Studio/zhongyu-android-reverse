.class public final Ld3/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld3/a$a;
    }
.end annotation


# static fields
.field public static final a:Ld3/a;

.field public static b:Lcom/friday/lecture/floatwindow/FloatWindowStatus;

.field public static c:Lcom/friday/lecture/floatwindow/FloatWindowStatus;

.field public static final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ld3/a;

    .line 2
    .line 3
    invoke-direct {v0}, Ld3/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ld3/a;->a:Ld3/a;

    .line 7
    .line 8
    sget-object v0, Lcom/friday/lecture/floatwindow/FloatWindowStatus;->c:Lcom/friday/lecture/floatwindow/FloatWindowStatus;

    .line 9
    .line 10
    sput-object v0, Ld3/a;->b:Lcom/friday/lecture/floatwindow/FloatWindowStatus;

    .line 11
    .line 12
    sget-object v0, Lcom/friday/lecture/floatwindow/FloatWindowStatus;->d:Lcom/friday/lecture/floatwindow/FloatWindowStatus;

    .line 13
    .line 14
    sput-object v0, Ld3/a;->c:Lcom/friday/lecture/floatwindow/FloatWindowStatus;

    .line 15
    .line 16
    const/16 v0, 0x8

    .line 17
    .line 18
    sput v0, Ld3/a;->d:I

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ld3/a;->b()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ld3/a;->i()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final b()V
    .locals 1

    .line 1
    sget-object v0, Lcom/friday/lecture/floatwindow/options/a;->g:Lcom/friday/lecture/floatwindow/options/a$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/friday/lecture/floatwindow/options/a$a;->a()Lcom/friday/lecture/floatwindow/options/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/friday/lecture/floatwindow/options/a;->j()V

    .line 8
    .line 9
    .line 10
    sget-object v0, Lcom/friday/lecture/floatwindow/homework/b;->d:Lcom/friday/lecture/floatwindow/homework/b$a;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/friday/lecture/floatwindow/homework/b$a;->a()Lcom/friday/lecture/floatwindow/homework/b;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Lcom/friday/lecture/floatwindow/homework/b;->g()V

    .line 17
    .line 18
    .line 19
    sget-object v0, Li3/i0;->d:Li3/i0$a;

    .line 20
    .line 21
    invoke-virtual {v0}, Li3/i0$a;->a()Li3/i0;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Li3/i0;->e()V

    .line 26
    .line 27
    .line 28
    sget-object v0, Li3/q;->d:Li3/q$a;

    .line 29
    .line 30
    invoke-virtual {v0}, Li3/q$a;->a()Li3/q;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Li3/q;->e()V

    .line 35
    .line 36
    .line 37
    sget-object v0, Lcom/friday/lecture/floatwindow/canvas/a;->d:Lcom/friday/lecture/floatwindow/canvas/a$a;

    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/friday/lecture/floatwindow/canvas/a$a;->a()Lcom/friday/lecture/floatwindow/canvas/a;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, Lcom/friday/lecture/floatwindow/canvas/a;->h()V

    .line 44
    .line 45
    .line 46
    sget-object v0, Lh3/k;->d:Lh3/k$a;

    .line 47
    .line 48
    invoke-virtual {v0}, Lh3/k$a;->a()Lh3/k;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Lh3/k;->d()V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public final c()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ld3/a;->b()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/friday/lecture/floatwindow/homework/b;->d:Lcom/friday/lecture/floatwindow/homework/b$a;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/friday/lecture/floatwindow/homework/b$a;->a()Lcom/friday/lecture/floatwindow/homework/b;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lcom/friday/lecture/floatwindow/homework/b;->h()V

    .line 11
    .line 12
    .line 13
    sget-object v0, Lcom/friday/lecture/floatwindow/FloatWindowStatus;->d:Lcom/friday/lecture/floatwindow/FloatWindowStatus;

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Ld3/a;->e(Lcom/friday/lecture/floatwindow/FloatWindowStatus;)V

    .line 16
    .line 17
    .line 18
    sget-object v0, Li3/i0;->d:Li3/i0$a;

    .line 19
    .line 20
    invoke-virtual {v0}, Li3/i0$a;->a()Li3/i0;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Li3/i0;->f()V

    .line 25
    .line 26
    .line 27
    sget-object v0, Li3/q;->d:Li3/q$a;

    .line 28
    .line 29
    invoke-virtual {v0}, Li3/q$a;->a()Li3/q;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Li3/q;->f()V

    .line 34
    .line 35
    .line 36
    sget-object v0, Lh3/k;->d:Lh3/k$a;

    .line 37
    .line 38
    invoke-virtual {v0}, Lh3/k$a;->a()Lh3/k;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Lh3/k;->e()V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final d()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ld3/a;->b()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/friday/lecture/floatwindow/homework/b;->d:Lcom/friday/lecture/floatwindow/homework/b$a;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/friday/lecture/floatwindow/homework/b$a;->a()Lcom/friday/lecture/floatwindow/homework/b;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lcom/friday/lecture/floatwindow/homework/b;->h()V

    .line 11
    .line 12
    .line 13
    sget-object v0, Lcom/friday/lecture/floatwindow/FloatWindowStatus;->d:Lcom/friday/lecture/floatwindow/FloatWindowStatus;

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Ld3/a;->e(Lcom/friday/lecture/floatwindow/FloatWindowStatus;)V

    .line 16
    .line 17
    .line 18
    sget-object v0, Li3/i0;->d:Li3/i0$a;

    .line 19
    .line 20
    invoke-virtual {v0}, Li3/i0$a;->a()Li3/i0;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Li3/i0;->f()V

    .line 25
    .line 26
    .line 27
    sget-object v0, Li3/q;->d:Li3/q$a;

    .line 28
    .line 29
    invoke-virtual {v0}, Li3/q$a;->a()Li3/q;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Li3/q;->f()V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final e(Lcom/friday/lecture/floatwindow/FloatWindowStatus;)V
    .locals 2

    .line 1
    sput-object p1, Ld3/a;->c:Lcom/friday/lecture/floatwindow/FloatWindowStatus;

    .line 2
    .line 3
    const-string v0, "key_current_class_state"

    .line 4
    .line 5
    const-class v1, Lcom/friday/lecture/floatwindow/FloatWindowStatus;

    .line 6
    .line 7
    invoke-static {v0, v1}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0, p1}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final f()V
    .locals 2

    .line 1
    sget-object v0, Ld3/a;->c:Lcom/friday/lecture/floatwindow/FloatWindowStatus;

    .line 2
    .line 3
    sget-object v1, Ld3/a$a;->a:[I

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    aget v0, v1, v0

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-eq v0, v1, :cond_2

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    if-eq v0, v1, :cond_1

    .line 16
    .line 17
    const/4 v1, 0x3

    .line 18
    if-eq v0, v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Ld3/a;->g()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    invoke-virtual {p0}, Ld3/a;->g()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    invoke-virtual {p0}, Ld3/a;->h()V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_2
    invoke-virtual {p0}, Ld3/a;->l()V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final g()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ld3/a;->b()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/friday/lecture/floatwindow/homework/b;->d:Lcom/friday/lecture/floatwindow/homework/b$a;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/friday/lecture/floatwindow/homework/b$a;->a()Lcom/friday/lecture/floatwindow/homework/b;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lcom/friday/lecture/floatwindow/homework/b;->i()V

    .line 11
    .line 12
    .line 13
    sget-object v0, Lcom/friday/lecture/floatwindow/FloatWindowStatus;->d:Lcom/friday/lecture/floatwindow/FloatWindowStatus;

    .line 14
    .line 15
    sput-object v0, Ld3/a;->b:Lcom/friday/lecture/floatwindow/FloatWindowStatus;

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Ld3/a;->e(Lcom/friday/lecture/floatwindow/FloatWindowStatus;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final h()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ld3/a;->b()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Li3/q;->d:Li3/q$a;

    .line 5
    .line 6
    invoke-virtual {v0}, Li3/q$a;->a()Li3/q;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Li3/q;->g()V

    .line 11
    .line 12
    .line 13
    sget-object v0, Lcom/friday/lecture/floatwindow/FloatWindowStatus;->f:Lcom/friday/lecture/floatwindow/FloatWindowStatus;

    .line 14
    .line 15
    sput-object v0, Ld3/a;->b:Lcom/friday/lecture/floatwindow/FloatWindowStatus;

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Ld3/a;->e(Lcom/friday/lecture/floatwindow/FloatWindowStatus;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final i()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ld3/a;->b()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/friday/lecture/floatwindow/options/a;->g:Lcom/friday/lecture/floatwindow/options/a$a;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/friday/lecture/floatwindow/options/a$a;->a()Lcom/friday/lecture/floatwindow/options/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x1

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-static {v0, v3, v1, v2}, Lcom/friday/lecture/floatwindow/options/a;->q(Lcom/friday/lecture/floatwindow/options/a;ZILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Lcom/friday/lecture/floatwindow/FloatWindowStatus;->c:Lcom/friday/lecture/floatwindow/FloatWindowStatus;

    .line 17
    .line 18
    sput-object v0, Ld3/a;->b:Lcom/friday/lecture/floatwindow/FloatWindowStatus;

    .line 19
    .line 20
    return-void
.end method

.method public final j()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ld3/a;->b()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/friday/lecture/floatwindow/canvas/a;->d:Lcom/friday/lecture/floatwindow/canvas/a$a;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/friday/lecture/floatwindow/canvas/a$a;->a()Lcom/friday/lecture/floatwindow/canvas/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lcom/friday/lecture/floatwindow/canvas/a;->i()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final k()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ld3/a;->b()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lh3/k;->d:Lh3/k$a;

    .line 5
    .line 6
    invoke-virtual {v0}, Lh3/k$a;->a()Lh3/k;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lh3/k;->f()V

    .line 11
    .line 12
    .line 13
    sget-object v0, Lcom/friday/lecture/floatwindow/FloatWindowStatus;->g:Lcom/friday/lecture/floatwindow/FloatWindowStatus;

    .line 14
    .line 15
    sput-object v0, Ld3/a;->b:Lcom/friday/lecture/floatwindow/FloatWindowStatus;

    .line 16
    .line 17
    return-void
.end method

.method public final l()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ld3/a;->b()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Li3/i0;->d:Li3/i0$a;

    .line 5
    .line 6
    invoke-virtual {v0}, Li3/i0$a;->a()Li3/i0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Li3/i0;->g()V

    .line 11
    .line 12
    .line 13
    sget-object v0, Lcom/friday/lecture/floatwindow/FloatWindowStatus;->e:Lcom/friday/lecture/floatwindow/FloatWindowStatus;

    .line 14
    .line 15
    sput-object v0, Ld3/a;->b:Lcom/friday/lecture/floatwindow/FloatWindowStatus;

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Ld3/a;->e(Lcom/friday/lecture/floatwindow/FloatWindowStatus;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
