.class public Lk5/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lk5/d;

.field public final b:Ljava/lang/String;

.field public final c:Lk5/c;

.field public final d:I

.field public final e:Landroid/content/Context;

.field public final f:Ljava/lang/String;

.field public final g:Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;

.field public final h:Li5/c;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILk5/c;Landroid/content/Context;Ljava/lang/String;Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;Li5/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk5/a;->b:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p3, p0, Lk5/a;->c:Lk5/c;

    .line 7
    .line 8
    iput p2, p0, Lk5/a;->d:I

    .line 9
    .line 10
    iput-object p4, p0, Lk5/a;->e:Landroid/content/Context;

    .line 11
    .line 12
    iput-object p5, p0, Lk5/a;->f:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p6, p0, Lk5/a;->g:Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;

    .line 15
    .line 16
    iput-object p7, p0, Lk5/a;->h:Li5/c;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public a()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/a;->e:Landroid/content/Context;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()Lk5/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/a;->c:Lk5/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/a;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()I
    .locals 1

    .line 1
    iget v0, p0, Lk5/a;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/a;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public f()Li5/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/a;->h:Li5/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public g()Ljava/util/concurrent/Callable;
    .locals 8

    .line 1
    new-instance v0, Lk5/f;

    .line 2
    .line 3
    iget-object v1, p0, Lk5/a;->b:Ljava/lang/String;

    .line 4
    .line 5
    iget v2, p0, Lk5/a;->d:I

    .line 6
    .line 7
    iget-object v3, p0, Lk5/a;->c:Lk5/c;

    .line 8
    .line 9
    iget-object v4, p0, Lk5/a;->e:Landroid/content/Context;

    .line 10
    .line 11
    iget-object v5, p0, Lk5/a;->f:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v6, p0, Lk5/a;->g:Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;

    .line 14
    .line 15
    iget-object v7, p0, Lk5/a;->h:Li5/c;

    .line 16
    .line 17
    invoke-direct/range {v0 .. v7}, Lk5/f;-><init>(Ljava/lang/String;ILk5/c;Landroid/content/Context;Ljava/lang/String;Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;Li5/c;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method
