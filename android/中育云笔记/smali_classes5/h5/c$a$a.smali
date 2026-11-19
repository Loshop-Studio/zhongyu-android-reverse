.class public Lh5/c$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh5/c$a;->a()Ljava/lang/Boolean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lj5/b;

.field public final synthetic d:Li5/c;

.field public final synthetic e:Lh5/c$a;


# direct methods
.method public constructor <init>(Lh5/c$a;Lj5/b;Li5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lh5/c$a$a;->e:Lh5/c$a;

    .line 2
    .line 3
    iput-object p2, p0, Lh5/c$a$a;->c:Lj5/b;

    .line 4
    .line 5
    iput-object p3, p0, Lh5/c$a$a;->d:Li5/c;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lh5/c$a$a;->c:Lj5/b;

    .line 2
    .line 3
    iget-object v1, p0, Lh5/c$a$a;->e:Lh5/c$a;

    .line 4
    .line 5
    iget-object v1, v1, Lh5/c$a;->a:Landroid/content/Context;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, Lh5/c$a$a;->d:Li5/c;

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Lj5/b;->f(Ljava/lang/String;Li5/c;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
