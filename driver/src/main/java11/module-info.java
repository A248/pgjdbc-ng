module com.impossibl.postgres {
  requires transitive com.impossibl.jdbc.spy;

  requires io.netty.buffer;
  requires io.netty.codec;
  requires io.netty.common;
  requires io.netty.handler;
  requires io.netty.transport;
  requires static io.netty.transport.epoll;
  requires static io.netty.transport.kqueue;
  requires static io.netty.transport.unix.common;

  requires static java.compiler;
  requires transitive java.logging;
  requires transitive java.naming;
  requires java.security.sasl;
  requires transitive java.sql;
  requires transitive java.transaction.xa;
  requires java.xml;

  exports com.impossibl.postgres.api.data;
  exports com.impossibl.postgres.api.jdbc;  
  exports com.impossibl.postgres.jdbc;
  exports com.impossibl.postgres.jdbc.xa;

  uses com.impossibl.postgres.system.procs.ProcProvider;

  provides com.impossibl.postgres.system.procs.ProcProvider with
    com.impossibl.postgres.system.procs.ACLItems,
    com.impossibl.postgres.system.procs.Arrays,
    com.impossibl.postgres.system.procs.BitMods,
    com.impossibl.postgres.system.procs.Bits,
    com.impossibl.postgres.system.procs.Bools,
    com.impossibl.postgres.system.procs.Boxes,
    com.impossibl.postgres.system.procs.Bytes,
    com.impossibl.postgres.system.procs.Cidrs,
    com.impossibl.postgres.system.procs.Circles,
    com.impossibl.postgres.system.procs.Dates,
    com.impossibl.postgres.system.procs.Domains,
    com.impossibl.postgres.system.procs.Float4s,
    com.impossibl.postgres.system.procs.Float8s,
    com.impossibl.postgres.system.procs.HStores,
    com.impossibl.postgres.system.procs.Inets,
    com.impossibl.postgres.system.procs.Int2s,
    com.impossibl.postgres.system.procs.Int2Vectors,
    com.impossibl.postgres.system.procs.Int4s,
    com.impossibl.postgres.system.procs.Int8s,
    com.impossibl.postgres.system.procs.Intervals,
    com.impossibl.postgres.system.procs.Jsons,
    com.impossibl.postgres.system.procs.Lines,
    com.impossibl.postgres.system.procs.LSegs,
    com.impossibl.postgres.system.procs.MacAddrs,
    com.impossibl.postgres.system.procs.MacAddr8s,
    com.impossibl.postgres.system.procs.Moneys,
    com.impossibl.postgres.system.procs.Names,
    com.impossibl.postgres.system.procs.NumericMods,
    com.impossibl.postgres.system.procs.Numerics,
    com.impossibl.postgres.system.procs.Oids,
    com.impossibl.postgres.system.procs.OidVectors,
    com.impossibl.postgres.system.procs.Paths,
    com.impossibl.postgres.system.procs.Points,
    com.impossibl.postgres.system.procs.Polygons,
    com.impossibl.postgres.system.procs.Ranges,
    com.impossibl.postgres.system.procs.Records,
    com.impossibl.postgres.system.procs.RefCursors,
    com.impossibl.postgres.system.procs.Strings,
    com.impossibl.postgres.system.procs.Tids,
    com.impossibl.postgres.system.procs.TimeMods,
    com.impossibl.postgres.system.procs.TimestampMods,
    com.impossibl.postgres.system.procs.TimestampsWithoutTZ,
    com.impossibl.postgres.system.procs.TimestampsWithTZ,
    com.impossibl.postgres.system.procs.TimesWithoutTZ,
    com.impossibl.postgres.system.procs.TimesWithTZ,
    com.impossibl.postgres.system.procs.UInt4s,
    com.impossibl.postgres.system.procs.UUIDs,
    com.impossibl.postgres.system.procs.XMLs;
  provides java.sql.Driver with
    com.impossibl.postgres.jdbc.PGDriver;
}