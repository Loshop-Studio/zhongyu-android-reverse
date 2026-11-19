.class public Le0/a$c;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public a:I

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Le0/a$c;->a:I

    const-string v0, ""

    iput-object v0, p0, Le0/a$c;->b:Ljava/lang/String;

    iput-object v0, p0, Le0/a$c;->c:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Le0/a$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Le0/a$c;-><init>()V

    return-void
.end method

.method public static synthetic a(Le0/a$c;I)I
    .locals 0

    .line 1
    iput p1, p0, Le0/a$c;->a:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic b(Le0/a$c;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Le0/a$c;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic c(Le0/a$c;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    iput-object p1, p0, Le0/a$c;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic d(Le0/a$c;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Le0/a$c;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic e(Le0/a$c;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    iput-object p1, p0, Le0/a$c;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic f(Le0/a$c;)I
    .locals 0

    .line 1
    iget p0, p0, Le0/a$c;->a:I

    .line 2
    .line 3
    return p0
.end method
