.class public final Lu7/j;
.super Lr7/a;
.source "SourceFile"


# instance fields
.field public final synthetic e:Lu7/o;

.field public final synthetic f:I

.field public final synthetic g:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Lu7/o;II)V
    .locals 0

    .line 1
    iput-object p2, p0, Lu7/j;->e:Lu7/o;

    .line 2
    .line 3
    iput p3, p0, Lu7/j;->f:I

    .line 4
    .line 5
    iput p4, p0, Lu7/j;->g:I

    .line 6
    .line 7
    const/4 p2, 0x1

    .line 8
    invoke-direct {p0, p1, p2}, Lr7/a;-><init>(Ljava/lang/String;Z)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a()J
    .locals 5

    .line 1
    iget-object v0, p0, Lu7/j;->e:Lu7/o;

    .line 2
    .line 3
    iget v1, p0, Lu7/j;->f:I

    .line 4
    .line 5
    iget v2, p0, Lu7/j;->g:I

    .line 6
    .line 7
    :try_start_0
    iget-object v3, v0, Lu7/o;->w:Lu7/x;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    invoke-virtual {v3, v4, v1, v2}, Lu7/x;->f(ZII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catch_0
    move-exception v1

    .line 15
    invoke-virtual {v0, v1}, Lu7/o;->b(Ljava/io/IOException;)V

    .line 16
    .line 17
    .line 18
    :goto_0
    const-wide/16 v0, -0x1

    .line 19
    .line 20
    return-wide v0
.end method
