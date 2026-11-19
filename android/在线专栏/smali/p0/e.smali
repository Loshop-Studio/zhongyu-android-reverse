.class public final synthetic Lp0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj/a;


# static fields
.field public static final synthetic a:Lp0/e;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lp0/e;

    invoke-direct {v0}, Lp0/e;-><init>()V

    sput-object v0, Lp0/e;->a:Lp0/e;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ls0/f;

    invoke-interface {p1}, Ls0/f;->G()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method
