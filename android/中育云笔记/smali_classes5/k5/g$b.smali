.class public Lk5/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk5/g;->h(Lm5/c;Lh5/b;Ljava/lang/String;Li5/c;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lm5/c;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Li5/c;

.field public final synthetic f:I

.field public final synthetic g:Lh5/b;

.field public final synthetic h:Lk5/g;


# direct methods
.method public constructor <init>(Lk5/g;Lm5/c;Ljava/lang/String;Li5/c;ILh5/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk5/g$b;->h:Lk5/g;

    .line 2
    .line 3
    iput-object p2, p0, Lk5/g$b;->c:Lm5/c;

    .line 4
    .line 5
    iput-object p3, p0, Lk5/g$b;->d:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lk5/g$b;->e:Li5/c;

    .line 8
    .line 9
    iput p5, p0, Lk5/g$b;->f:I

    .line 10
    .line 11
    iput-object p6, p0, Lk5/g$b;->g:Lh5/b;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lk5/g$b;->h:Lk5/g;

    .line 2
    .line 3
    iget-object v1, p0, Lk5/g$b;->c:Lm5/c;

    .line 4
    .line 5
    iget-object v2, p0, Lk5/g$b;->d:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lk5/g$b;->e:Li5/c;

    .line 8
    .line 9
    iget v4, p0, Lk5/g$b;->f:I

    .line 10
    .line 11
    invoke-virtual {v0, v1, v2, v3, v4}, Lk5/g;->c(Lm5/c;Ljava/lang/String;Li5/c;I)Lk5/d;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v2, p0, Lk5/g$b;->g:Lh5/b;

    .line 16
    .line 17
    invoke-static {v0, v1, v2}, Lk5/g;->g(Lk5/g;Lk5/d;Lh5/b;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
