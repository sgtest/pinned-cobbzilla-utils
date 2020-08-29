package org.cobbzilla.util.daemon;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum TerminationRequestResult {

    alive (true),
    dead (false),
    interrupted_alive (true),
    interrupted_dead (false),
    terminated (false);

    @Getter private final boolean running;

    @JsonCreator public static TerminationRequestResult fromString (String val) { return valueOf(val.toLowerCase()); }

}
