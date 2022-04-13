import React from "react";
import Dashboard from "./Dashboard";
import {render} from "@testing-library/react";


test("Snapshot test to find text on dashboard", () => {
    const {getByText} = render(<Dashboard/>);
    const linkElement = getByText(/center node/i);
    expect(linkElement).toBeInTheDocument();
});

global.ResizeObserver = require('resize-observer-polyfill')