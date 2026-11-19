.class public final Ll3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj3/i;


# static fields
.field public static final a:Ll3/a;

.field public static final b:Lr2/v;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ll3/a;

    .line 2
    .line 3
    invoke-direct {v0}, Ll3/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ll3/a;->a:Ll3/a;

    .line 7
    .line 8
    const-string v0, "text/plain; charset=UTF-8"

    .line 9
    .line 10
    invoke-static {v0}, Lr2/v;->e(Ljava/lang/String;)Lr2/v;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Ll3/a;->b:Lr2/v;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ll3/a;->b(Ljava/lang/Object;)Lr2/z;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public b(Ljava/lang/Object;)Lr2/z;
    .locals 1

    .line 1
    sget-object v0, Ll3/a;->b:Lr2/v;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {v0, p1}, Lr2/z;->create(Lr2/v;Ljava/lang/String;)Lr2/z;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method
